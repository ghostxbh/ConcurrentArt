package com.uzykj.concurrent.code.lesson04;

/**
 * 使用synchronized解决可见性
 * Created by ghostxbh 2019-10-22
 */
public class VisibleSyn {
    private static byte[] obj = new byte[0];
    private static boolean stop;

    /**
     * 输出：
     * A is running
     * B is running
     * B is end
     * A is end
     */
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println("A is running");
            synchronized (obj){
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (!stop);
            }
            System.out.println("A is end");
        }).start();
        Thread.sleep(10);
        new Thread(() -> {
            System.out.println("B is running");
            synchronized (obj){
                stop = true;
                obj.notify();
            }
            System.out.println("B is end");
        }).start();
    }
}
