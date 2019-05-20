package com.uzykj.mall.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * Create by xbh 2019-05-14
 */
public class ModelUtil {

    /**
     * 获取当前时间
     * @param timeFormat
     * @return String
     */
    public static String getTodayByFormat(String timeFormat){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(timeFormat));
    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            String uuid = UUID.randomUUID().toString();
            System.out.println(uuid);
        }
    }
}
