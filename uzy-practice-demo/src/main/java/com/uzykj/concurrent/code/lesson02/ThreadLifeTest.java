package main.java.com.uzykj.concurrent.code.lesson02;

/**
 * @author ghostxbh
 * @date 2019-11-04
 * @description 线程的生命周期
 */
public class ThreadLifeTest extends Thread {

    public ThreadLifeTest(String name){
        super(name);
    }


    public void run(){
        // 运行状态
        System.out.println("----- [ " + super.getName() +" ] ----- 运行状态 ----");

        try {
            long interval = 10 * 1000;
            // 阻塞状态
            Thread.sleep(interval);
            System.out.println("----- [ " + super.getName() +" ] ----- 阻塞状态 ---- 阻塞时长：" + interval + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 新建状态 | 初始化
        ThreadLifeTest nice = new ThreadLifeTest("Nice");
        System.out.println("----- [ " + nice.getName() + " ] ---- 初始化完成 ----");
        // 就绪状态
        System.out.println("----- [ " + nice.getName() + " ] ---- 就绪状态 ----");
        nice.start();

        nice.join();

        // 死亡状态
        System.out.println("----- [ " + nice.getName() + " ] ---- 死亡状态 ----");
    }
}
