package com.uzykj.io.bio;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ghostxbh
 * @date 2021/2/22
 * @description BIO服务端
 */
@Slf4j
public class BIOServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            log.info("服务端已启动，等待连接");
            // 阻塞
            Socket socket = serverSocket.accept();
            log.info("客户端已连接");

            // 单线程处理链接
            // handler(socket);

            // 多线程处理链接
            new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    log.info("local-thread-{}", Thread.currentThread().getName());
                    handler(socket);
                }
            }).start();
        }
    }

    private static void handler(Socket socket) throws IOException {
        byte[] bytes = new byte[1024];
        log.info("获取客户端发送数据");
        // 接收数据，阻塞方法，没有数据可读时就阻塞
        int read = socket.getInputStream().read(bytes);
        if (read != -1) {
            log.info("接收客户数据: {}", new String(bytes, 0, read));
        }

        // 响应客户端
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("server is connecting".getBytes());
        outputStream.flush();
    }
}
