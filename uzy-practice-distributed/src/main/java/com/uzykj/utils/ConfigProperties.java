package com.uzykj.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获取配置
 *
 * @author ghostxbh
 * @date 2019-10-31
 */
public class ConfigProperties {

    // 获取服务列表配置
    public static String getServerConfig() {
        Properties prop = new Properties();
        InputStream inputStream = ConfigProperties.class.getResourceAsStream("/zookeeper.properties");
        try {
            prop.load(inputStream);
            return prop.getProperty("connections");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
