# 课节01 线程的实现方式

## 继承Thread

`Thread`其实是`Runnable`的变种，因为`class Thread implements Runnable`

### 示例：
```java
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
        while(i++ < 20){
            System.out.println(Thread.currentThread().getName() + "----" + i + "----" + name + "----" + gender);
        }
    }

    public static void main(String[] args) {
        ThreadTest A = new ThreadTest("A", "blog");
        ThreadTest B = new ThreadTest("B", "flag");

        A.start();
        B.start();
    }
}
```

## 实现Runnable
```java
public class RunnableTest implements Runnable {
    private int num;

    public RunnableTest(int num){
        this.num = num;
    }

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
```

## Thread 和 Runnable
+ 两种方式：`extends Thread`和`implements Runnable`
   其中Thread其实是Runnable的变种，因为`class Thread implements Runnable`
   
+ 两种方式都需要重写`run()`方法，在此存放业务代码
+ 继承`Thread()`的方式，不需要定义线程名等，因为父类Thread类中已经定义。
   实现Runnable接口的方式，需要定义线程名等。
   
+ 实现Runnable接口的启动方式：
```
   Runnable runnable = new MyRunnableImple(args...);
   new Thread(runnable).start();
```

+ 继承Thread类的启动方式：
```
   Thread thread = new MyThread(args...);
   thread.start();
```

+ 两种方式都以`start()`启动线程

## Future和Callable

### Callable
**注意**：Callable 是一个泛型接口
```java
public class CallableTest implements Callable<Integer> {

    // 重写call()方法，有返回值
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(1000);
    }
}
```
### Future

+ 示例：
```
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
```

+ 输出：
```
future开始执行····执行时间：1572839373431
通过isDone判断任务是否计算完成····是否完成：false
通过isCancelled判断任务是否取消····是否取消：false
通过get()获取计算结果····结果：253
计算future执行用时····消耗时间：2ms
```


