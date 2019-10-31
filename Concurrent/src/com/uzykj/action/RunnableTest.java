package com.uzykj.action;

/**
 * Created by xbh 2019-10-25
 */
public class RunnableTest implements Runnable {
    private int num;

    public RunnableTest(int num){
        this.num = num;
    }

    /**
     * 并发操作时会有原子性问题
     * 可以使用synchronized同步业务代码块
     */
    private void sale() {
        if (num > 0) {
            num--;
            System.out.println(Thread.currentThread().getName() + "----" + getRemain());
        }
    }

    private int getRemain(){
        return num;
    }

    @Override
    public void run() {
        while (true){
            sale();
        }
    }

    public static void main(String[] args) {
        RunnableTest rt = new RunnableTest(10);
        Thread thread1 = new Thread(rt);
        Thread thread2 = new Thread(rt);
        Thread thread3 = new Thread(rt);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
