package com.uzykj.io.aio;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @author ghostxbh
 * @date 2021/2/24
 * @description AIO服务端
 */
@Slf4j
public class AIOServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        AsynchronousServerSocketChannel assc = AsynchronousServerSocketChannel.open().bind(new InetSocketAddress(8080));
        assc.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @SneakyThrows
            @Override
            public void completed(AsynchronousSocketChannel socketChannel, Object attachment) {
                log.info("connet -- {}", Thread.currentThread().getName());
                // 在此接收客户端连接，否则后面的客户端连接不上服务端
                assc.accept(attachment, this);
                log.info("客户端：{}", socketChannel.getRemoteAddress());
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                socketChannel.read(byteBuffer, byteBuffer, new CompletionHandler<Integer, ByteBuffer>() {
                    @Override
                    public void completed(Integer result, ByteBuffer attachment) {
                        log.info("read -- {}", Thread.currentThread().getName());
                        byteBuffer.flip();
                        log.info("客户端请求数据：{}", new String(byteBuffer.array(), 0, result));
                        socketChannel.write(ByteBuffer.wrap("This is response data".getBytes()));
                    }

                    @Override
                    public void failed(Throwable exc, ByteBuffer attachment) {
                        log.error("read error: {}", exc.getMessage());
                        exc.printStackTrace();
                    }
                });
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                log.error("connect error: {}", exc.getMessage());
                exc.printStackTrace();
            }
        });

        log.info("main -- {}", Thread.currentThread().getName());
        Thread.sleep(Integer.MAX_VALUE);
    }
}
