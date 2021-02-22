package com.uzykj.concurrent.code.lesson03;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author ghostxbh
 * @date 2019-11-04
 * @description 线程的优先级
 */
public class ThreadPriorityTest extends Thread {

    public ThreadPriorityTest(String name) {
        super(name);
    }

    public void run() {
        Integer interval = 3 * 1000;
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()) + " Thread[ " + super.getName() + " ] is running, predict run time: " + interval + "ms");
        try {
            Thread.sleep(interval);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sdf.format(new Date()) + " Thread[ " + super.getName() + " ] is end");
    }

    public static void main(String[] args) {
        // 设置线程组长度
        int maxSize = 9;
        Thread[] threads = new Thread[maxSize];
        for (int i = 0; i < maxSize; i++) {
            // 0-2为高优先级
            if (0 <= i && i < 3) {
                threads[i] = new ThreadPriorityTest("高优先级线程--" + i);
                threads[i].setPriority(Thread.MAX_PRIORITY);
            }
            // 3-5为正常优先级
            if (3 <= i && i < 6) {
                threads[i] = new ThreadPriorityTest("正常优先级线程--" + i);
                threads[i].setPriority(Thread.NORM_PRIORITY);
            }
            // 6-8为低优先级
            if (6 <= i && i < maxSize) {
                threads[i] = new ThreadPriorityTest("低优先级线程--" + i);
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
        }
        // 启动线程组
        Arrays.asList(threads).forEach(item -> item.start());
    }
}
