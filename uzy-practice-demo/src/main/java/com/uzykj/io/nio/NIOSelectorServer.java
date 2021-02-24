package com.uzykj.io.nio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ghostxbh
 * @date 2021/2/23
 * @description NIO多路复用服务端
 */
@Slf4j
public class NIOSelectorServer {

    public static void main(String[] args) throws IOException {
        // 创建 NIO 通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定服务端口地址
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));
        // 设置通道为非阻塞模式
        serverSocketChannel.configureBlocking(false);
        // 打开 Selector 处理 Channel，即创建 epoll(poll)
        Selector selector = Selector.open();
        // Channel 注册到 selector 上，并 selector 对客户端 accept 操作监听
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        log.info("服务端已启动，等待连接");

        while (true) {
            // 阻塞等待需要处理的事件发生，即 事件轮训
            selector.select();
            // 获取 selector 中注册的全部事件中的 selectedKeys 实例
            Set<SelectionKey> selectionKeys = selector.selectedKeys();

            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
            // 遍历对 selectionKeys 事件进行处理
            while (keyIterator.hasNext()) {
                SelectionKey selectionKey = keyIterator.next();
                // 是 OP_ACCEPT 事件，则进行后续的获取数据和事件注册
                if (selectionKey.isAcceptable()) {
                    ServerSocketChannel serverSocket = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel socketChannel = serverSocket.accept();
                    socketChannel.configureBlocking(false);
                    // 注册 OP_READ 事件，需要给客户端发送数据，则注册 OP_WRITE 即可
                    socketChannel.register(selector, SelectionKey.OP_READ);
                    log.info("客户端已连接: {}", socketChannel.getRemoteAddress());

                    // 是 OP_READ 事件，则获取客户端发送的数据
                } else if (selectionKey.isReadable()) {
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(128);
                    int read = socketChannel.read(byteBuffer);
                    if (read > 0) {
                        log.info("接收客户 {}, 数据: {}", socketChannel.getRemoteAddress(), new String(byteBuffer.array()));
                    } else if (read < 0) {
                        socketChannel.close();
                        log.info("客户端已断开连接");
                    }
                }
                // selectionKeys 没有对应事件即移除，防止下次 seletor 重复处理
                keyIterator.remove();
            }
        }
    }
}
