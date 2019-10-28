package action;

/**
 * Created by xbh 2019-10-25
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
//        while(i++ < 20){
//            System.out.println(Thread.currentThread().getName() + "----" + i + "----" + name + "----" + gender);
//        }
        // 加锁
        synchronized (ThreadTest.class){
            while(i++ < 20){
                System.out.println(Thread.currentThread().getName() + "----" + i + "----" + name + "----" + gender);
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest A = new ThreadTest("A", "blog");
        ThreadTest B = new ThreadTest("B", "flag");

        A.start();
        B.start();
    }
}
