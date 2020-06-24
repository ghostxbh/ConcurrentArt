## jvm的组成部分
Test.java
    - 类加载器子系统
    - 运行时数据区
    - 执行引擎 
    
## 概念
    - class文件
    - class content
        - 通过类加载器把class加载到内存中
    - Class对象
        - 基于类加载器解析class content的数据规范 -> 运行时数据区.方法区（原空间）
    - 对象
        - Girl girl = new Girl(); 
    
    
## 方法区
方法区相当于interface
永久代与元空间相当于impl

- 永久代
    - 堆
    - jdk7
- 元空间
    - 内存 native memory
    - jdk8