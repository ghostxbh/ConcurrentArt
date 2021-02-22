package com.uzykj.dp.proxy.agency;

import com.uzykj.dp.proxy.owner.HouseOwner;

import java.util.logging.Logger;

/**
 * @author ghostxbh
 * @date 2019-11-01
 * @description 静态代理：代理对象：接口
 */
public class HouseAgency implements HouseOwner{

    private static Logger log = Logger.getLogger(HouseAgency.class.getName());

    /**
     * 被代理房主
     */
    private HouseOwner houseOwner;

    public HouseAgency(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    /**
     * 房屋中介租房
     */
    public void leaseHouse(){
        log.info("带租房者看房筛选租领房屋");
        houseOwner.leaseHouse();
        log.info("跟房主签订合同，跟租房者签订合同");
    }
}
