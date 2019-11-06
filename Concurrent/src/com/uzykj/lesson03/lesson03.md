# 课节03 线程的优先级

## 简介
线程可以划分优先级，较高的优先级得到比较多的线程资源，较低的优先级得到比较少的线程资源。

**CPU会先执行优先级高的线程对象**中的任务。

设置线程优先级有助于帮助“线程规划器”确定在下一次选择哪个线程来优先执行。

线程优先级分为10个等级范围，**1 ~ 10**，超出这个范围返回会报错`IllegalArgumentException`

三个常用等级：
```
public static final int MIN_PRIORITY = 1;   //标示高优先级的线程。
public static final int NORM_PRIORITY = 5;  //标识正常优先级的线程。
public static final int MAX_PRIORITY = 10;  //标识低优先级的线程。
```
默认优先级等级为`NORM_PRIORITY`

线程的优先级具有继承性

+ 线程的优先级与线程的执行顺序
    + 在单核CPU中，高优先级的线程会优先获取CPU资源（但不一定）
    + 在多核CPU中，是乱序的，只是高优先级的线程在宏观上会被优先处理的比重大
    
## 输出示例
```
2019-11-06 16:40:53 Thread[ 高优先级线程--2 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 正常优先级线程--3 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 高优先级线程--1 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 低优先级线程--6 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 低优先级线程--7 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 正常优先级线程--4 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 正常优先级线程--5 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 高优先级线程--0 ] is running, predict run time: 3000ms
2019-11-06 16:40:53 Thread[ 低优先级线程--8 ] is running, predict run time: 3000ms
2019-11-06 16:40:56 Thread[ 低优先级线程--6 ] is end
2019-11-06 16:40:56 Thread[ 正常优先级线程--3 ] is end
2019-11-06 16:40:56 Thread[ 低优先级线程--8 ] is end
2019-11-06 16:40:56 Thread[ 低优先级线程--7 ] is end
2019-11-06 16:40:56 Thread[ 高优先级线程--2 ] is end
2019-11-06 16:40:56 Thread[ 正常优先级线程--4 ] is end
2019-11-06 16:40:56 Thread[ 高优先级线程--1 ] is end
2019-11-06 16:40:56 Thread[ 正常优先级线程--5 ] is end
2019-11-06 16:40:56 Thread[ 高优先级线程--0 ] is end
```