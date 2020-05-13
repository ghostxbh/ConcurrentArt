package com.uzykj.lesson01;

/**
 * @author ghostxbh
 * @date 2020/5/13
 * @description
 */
public class JMM_Visibility {
    private static int x = 0;
    private static boolean flag = false;

    static void writer() {
        x = 1;
        flag = true;
    }

    static void reader() {
        if (flag) {
            int A = x + 1;
            System.out.println("A ==> " + A);
        }
    }

    public static void main(String[] args) {
        W_R_Thread wRThread = new W_R_Thread();
        R_W_Thread rWThread = new R_W_Thread();
        rWThread.start();
        wRThread.start();
    }

    static class W_R_Thread extends Thread {
        public void run() {
            System.out.println("写-读线程");
            writer();
            System.out.println("变量 x = " + x);
            reader();
        }
    }

    static class R_W_Thread extends Thread {
        public void run() {
            System.out.println("读-写线程");
            reader();
            writer();
            System.out.println("变量 x = " + x);
        }
    }
}


