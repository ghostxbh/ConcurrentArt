package com.uzykj.concurrent.code.lesson05;

/**
 * @author ghostxbh
 * @date 2020/5/13
 * @description
 */
public class DeadLock {
    private static String A = "A";
    private static String B = "B";

    private void checkLock(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (B) {
                    System.out.println("1");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        new DeadLock().checkLock();
    }
}
