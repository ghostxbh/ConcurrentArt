# volatile的应用
volatile是轻量级的 synchronized，它在多处理器开发中保证了共享变量的“可见性”。
可见性的意思是当一个线程 修改一个共享变量时，另外一个线程能读到这个修改的值。
如果volatile变量修饰符使用恰当的话，它比synchronized的使用和执行成本更低，因为它不会引起线程上下文的切换和调度。
本文将深入分析在硬件层面上Intel处理器是如何实现volatile的，通过深入分析帮助我们正确地使用volatile变量。

## volatile的定义与实现原理

Java语言规范第3版中对volatile的定义如下：Java编程语言允许线程访问共享变量，为了 确保共享变量能被准确和一致地更新，线程应该确保通过排他锁单独获得这个变量。
Java语言 提供了volatile，在某些情况下比锁要更加方便。
如果一个字段被声明成volatile，Java线程内存 模型确保所有线程看到这个变量的值是一致的。

了解volatile实现原理之前，实现原理相关的CPU术语与说明

[![cpu]](/resource/images/volatile_cpu.jpg)

> volatile是如何来保证可见性的呢？让我们在X86处理器下通过工具获取JIT编译器生成的 汇编指令来查看对volatile进行写操作时，CPU会做什么事情。

```java
class VolatileDemo {
    private static volatile VolatileDemo instance;
    
    public static VolatileDemo getInstance(){
        if (instance == null) {
            instance = new VolatileDemo();
        }
        return instance;
    }   
}
```

转成汇编代码
```
0x01a3de1d: movb $0×0,0×1104800(%esi);0x01a3de24: lock addl $0×0,(%esp);
```