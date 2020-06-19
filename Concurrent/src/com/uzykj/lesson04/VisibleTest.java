package com.uzykj.lesson04;

/**
 * 可见性问题
 * Created by xbh 2019-10-18
 */
public class VisibleTest {
    private static long count = 0;

    void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    public static long acdc() throws InterruptedException {
        final VisibleTest visibleTest = new VisibleTest();
        Thread thread1 = new Thread(() -> visibleTest.add10K());
        Thread thread2 = new Thread(() -> visibleTest.add10K());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        return count;
    }

    /**
     * 输出： 10000 < count < 20000
     */
    public static void main(String[] args) {
        try {
            System.out.println(VisibleTest.acdc());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
