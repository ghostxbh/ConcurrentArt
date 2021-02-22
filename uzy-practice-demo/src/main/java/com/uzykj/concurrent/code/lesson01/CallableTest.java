package com.uzykj.concurrent.code.lesson01;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by ghostxbh 2019-11-04 实现Callable接口
 */
// Callable 是一个泛型接口
public class CallableTest implements Callable<Integer> {

    // 重写call()方法，有返回值
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(1000);
    }

    /**
     * 使用线程池执行Future任务
     */
    public static void futures() {
        //Future、Callable一般与Executor结合使用
        //Executor负责创建线程池服务
        //实现Callable接口形成的线程类，负责处理业务逻辑，并将处理结果返回
        //Future接口负责接收Callable接口返回的值
        ExecutorService threadPool = Executors.newFixedThreadPool(6);
        try {
            //定义一组返回值
            Future[] futures = new Future[6];
            //向线程池提交任务
            for (int i = 0; i < futures.length; i++) {
                futures[i] = threadPool.submit(new CallableTest());
            }
            //输出结果
            for (int i = 0; i < futures.length; i++) {
                System.out.println(futures[i].get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //将关闭线程池放在finally中，最大限度保证线程安全
            //记得关闭这个线程池
            threadPool.shutdown();
        }
    }

    /**
     * 简单Future线程示例
     */
    public static void singleFuture() {
        //Future接口常用API展示：isDone/isCancelled/get()
        //创建单线程
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //向线程池提交任务
        Future<Integer> future = executorService.submit(new CallableTest());
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("future开始执行····执行时间：" + startTime);
            System.out.println("通过isDone判断任务是否计算完成····是否完成：" + future.isDone());
            System.out.println("通过isCancelled判断任务是否取消····是否取消：" + future.isCancelled());
            System.out.println("通过get()获取计算结果····结果：" + future.get());
            System.out.println("计算future执行用时····消耗时间：" + (System.currentTimeMillis() - startTime) + "ms");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放线程池
            executorService.shutdown();
        }
    }

    public static void main(String[] args) {
        //futures();

        singleFuture();
    }
}