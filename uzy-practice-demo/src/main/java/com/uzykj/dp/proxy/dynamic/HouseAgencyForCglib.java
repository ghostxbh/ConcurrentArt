package com.uzykj.dp.proxy.dynamic;

import com.uzykj.dp.proxy.owner.HouseOwner;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * @author ghostxbh
 * @date 2019-11-01
 * @description
 */
public class HouseAgencyForCglib implements MethodInterceptor {

    private static Logger log = Logger.getLogger(HouseAgencyForCglib.class.getName());

    private HouseOwner houseOwner;

    public HouseAgencyForCglib(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    /**
     * 租赁房屋代理
     * @param obj           代理对象实例
     * @param method        被代理的方法
     * @param args          参数
     * @param methodProxy   方法代理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        log.info("带租房者看房筛选租领房屋");
        Object invoke = method.invoke(houseOwner, args);
        log.info("跟房主签订合同，跟租房者签订合同");
        return invoke;
    }
}
