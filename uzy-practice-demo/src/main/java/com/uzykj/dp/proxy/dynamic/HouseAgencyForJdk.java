package com.uzykj.dp.proxy.dynamic;

import com.uzykj.dp.proxy.owner.HouseOwner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * @author ghostxbh
 * @date 2019-11-01
 * @description jdk动态代理租赁
 */
public class HouseAgencyForJdk implements InvocationHandler {

    private static Logger log = Logger.getLogger(HouseAgencyForJdk.class.getName());

    private HouseOwner houseOwner;

    public HouseAgencyForJdk(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    /**
     * 租赁房屋代理
     * @param proxy     代理实例
     * @param method    被代理方法
     * @param args      参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("带租房者看房筛选租领房屋");
        Object invoke = method.invoke(houseOwner, args);
        log.info("跟房主签订合同，跟租房者签订合同");
        return invoke;
    }
}
