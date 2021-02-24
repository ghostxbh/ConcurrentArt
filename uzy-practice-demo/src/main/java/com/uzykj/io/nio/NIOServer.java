package com.uzykj.io.nio;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.List;

/**
 * @author ghostxbh
 * @date 2021/2/23
 * @description NIO服务端
 */
@Slf4j
public class NIOServer {
    static List<SocketChannel> channelList = Lists.newArrayList();

    public static void main(String[] args) throws IOException {
        // 创建 NIO 通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定服务端口地址
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));
        // 设置通道为非阻塞模式
        serverSocketChannel.configureBlocking(false);
        log.info("服务端已启动，等待连接");

        while (true) {
            // 非阻塞模式 accept() 方法不会阻塞。阻塞模式则会阻塞，即 socketChannel.configureBlocking(ture)
            // NIO的非阻塞是由操作系统内部实现的，底层调用了linux内核的accept函数
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (!ObjectUtils.isEmpty(socketChannel)) {
                log.info("客户端已连接: {}", socketChannel.getRemoteAddress());
                socketChannel.configureBlocking(false);
                // 连接成功放到 channelList 中
                channelList.add(socketChannel);
            }

            // 读取 channel
            Iterator<SocketChannel> iterator = channelList.iterator();
            while (iterator.hasNext()) {
                SocketChannel channel = iterator.next();
                ByteBuffer byteBuffer = ByteBuffer.allocate(128);

                // 非阻塞模式 read() 方法不会阻塞。阻塞模式则会阻塞
                int read = channel.read(byteBuffer);
                if (read > 0) {
                    log.info("接收客户 {}, 数据: {}", channel.getRemoteAddress(), new String(byteBuffer.array()));
                } else if (read < 0) {
                    //
                    iterator.remove();
                    log.info("客户端已断开连接");
                }
            }
        }
    }
}
