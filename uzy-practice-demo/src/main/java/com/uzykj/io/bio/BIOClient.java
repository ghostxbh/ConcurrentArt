package com.uzykj.io.bio;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ghostxbh
 * @date 2021/2/22
 * @description BIO客户端
 */
@Slf4j
public class BIOClient {
    private static final String HOST = "localhost";
    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(HOST, PORT);
        // 发送数据
        OutputStream os = socket.getOutputStream();
        os.write("request server connect".getBytes());
        os.flush();

        // 接收数据
        byte[] bytes = new byte[1024];
        InputStream is = socket.getInputStream();
        int read = is.read(bytes);
        if (read != -1) {
            log.info("接收到来自服务端的数据: {}", new String(bytes, 0, read));
        }

        socket.close();
    }
}
