package com.uzykj.concurrent.code.lesson01;

import java.util.concurrent.TimeUnit;

/**
 * Created by ghostxbh 2019-10-25
 */
public class ThreadTest extends Thread{

    private String name;
    private String gender;

    public ThreadTest(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void run(){
        int i = 0;
        // 不加锁
        while(i++ < 20){
            System.out.println(Thread.currentThread().getName() + "----" + i + "----" + name + "----" + gender);
        }
        // 加锁
//        synchronized (ThreadTest.class){
//            while(i++ < 20){
//                System.out.println(Thread.currentThread().getName() + "----" + i + "----" + name + "----" + gender);
//            }
//        }
    }

    public static void main(String[] args) {
//        ThreadTest A = new ThreadTest("A", "blog");
//        ThreadTest B = new ThreadTest("B", "flag");
//
//        A.start();
//        B.start();

        new TestT1().start();
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main");
        }
    }

    private static class TestT1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("TestT1");
            }
        }
    }
}
