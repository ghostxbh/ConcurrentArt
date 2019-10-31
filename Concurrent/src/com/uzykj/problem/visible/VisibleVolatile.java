package com.uzykj.problem.visible;

/**
 * 通过volatile关键字标记内存屏障保证可见性
 * Created by xbh 2019-10-18
 */
public class VisibleVolatile {
    private volatile static boolean tag;

    /**
     * 输出：
     * thread1 is running
     * thread2 is running
     * thread1 is end
     * thread2 is end
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("thread1 is running");
            while (!tag) ;
            System.out.println("thread1 is end");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2 is running");
            tag = true;
            System.out.println("thread2 is end");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
