package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import proxy.agency.HouseAgency;
import proxy.dynamic.HouseAgencyForCglib;
import proxy.dynamic.HouseAgencyForJdk;
import proxy.owner.HouseOwner;
import proxy.owner.HouseOwnerImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.logging.Logger;

/**
 * @author ghostxbh
 * @date 2019-11-01
 * @description 房屋租赁执行
 */
public class HouseAction {

    private static Logger log = Logger.getLogger(HouseAction.class.getName());

    /**
     * 直接找房主租赁房屋
     */
    public static void normalLease() {

        log.info("租房者筛选房屋");
        new HouseOwnerImpl().leaseHouse();
        log.info("租房者签订租房合同");

    }

    /**
     * 找中介租赁房屋
     * <p>
     * ### 静态代理的不足
     * 可维护性差：
     * + 被代理对象与代理类一一对应，如果新增被代理对象，则需要新增代理类。
     * + 被代理方法与代理方法一一对应，如果新增被代理方法，则需要新增代理方法。
     */
    public static void leaseByAgency() {
        // 被代理的房主
        HouseOwner houseOwner = new HouseOwnerImpl();

        // 租赁房屋
        new HouseAgency(houseOwner).leaseHouse();
    }

    /**
     * JDK通过`java.lang.reflect.Proxy`类能够实现动态代理，其主要流程如下：
     * <p>
     * 实现`InvocationHandler`接口，自定义自己需要的调用处理器：`invocationHandler`。
     * 获取被代理对象的接口加载器：`classLoader`。
     * 获取被代理的接口的类型：`clazz[]`。
     * 通过`java.lang.reflect.Proxy`的静态方法`newProxyInstance()`，以`invocationHandler`、`classLoader`和`clazz[]`为参数，生成代理对象。
     * 调用代理对象的代理方法。
     * **注意：**根据上述流程，可以确定JDK动态代理针对的是接口，而非类。
     */
    public static void leaseByAgencyForJdk() {
        // 被代理的房主
        HouseOwner houseOwner = new HouseOwnerImpl();

        // 被代理对象的接口加载器
        ClassLoader classLoader = HouseOwner.class.getClassLoader();

        // 被代理的接口的类型
        Class[] classes = {HouseOwner.class};

        // 代理时的调用处理器：房租中介
        InvocationHandler proxyHandler = new HouseAgencyForJdk(houseOwner);

        // 代理对象
        HouseOwner proxy = (HouseOwner) Proxy.newProxyInstance(classLoader, classes, proxyHandler);

        // 代理售房
        proxy.leaseHouse();

    }

    /**
     * JDK通过`org.springframework.cglib.proxy.Enhancer`类能够实现动态代理，其主要流程如下：
     * <p>
     * 实现`MethodInterceptor`接口，自定义自己需要的方法解释器：`methodInterceptor`。
     * 创建CGLIB增强型代理类：`enhancer`。
     * 为enhancer设置被代理对象的类型：`clazz`。
     * 以`methodInterceptor`为参数，为`enhancer`设置回调方法。
     * 调用Enhancer#`create()`方法创建代理对象。
     * 调用代理对象的代理方法。
     * 注意：CGLIB动态代理针对的是类。
     * <p>
     * 使用CGLIB可以直接引用其依赖，也可以使用springframework的内置CGLIB。
     * <p>
     * CGLib采用了非常底层的字节码技术，其原理是通过字节码技术为一个类创建子类，
     * 并在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。
     */
    public static void leaseByAgencyForCglib() {
        // 被代理的对象：房主
        HouseOwner houseOwner = new HouseOwnerImpl();

        // CGLIB增强的代理类
        Enhancer enhancer = new Enhancer();

        // 被代理对象的类型
        enhancer.setSuperclass(HouseOwner.class);

        // 定义代理时的方法解释器
        MethodInterceptor methodInterceptor = new HouseAgencyForCglib(houseOwner);

        // 以回调方式设置代理行为
        enhancer.setCallback(methodInterceptor);

        // 创建代理对象
        HouseOwner roomOwner = (HouseOwner) enhancer.create();

        // 代理租赁
        roomOwner.leaseHouse();
    }

    /**
     * 实际应用场景
     * Struts2中的拦截器Interceptor。
     * Spring中的AOP。
     * AspectJ的实现。
     *
     * @param args
     */
    public static void main(String[] args) {

        // normalLease();

        // leaseByAgency();

        // leaseByAgencyForJdk();

        leaseByAgencyForCglib();
    }
}
