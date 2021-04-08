package com.uzykj.design.pattern.proxy.owner;

import java.util.logging.Logger;

/**
 * @author ghostxbh
 * @date 2019-11-01
 * @description
 */
public class HouseOwnerImpl implements HouseOwner {

    private static Logger log = Logger.getLogger(HouseOwnerImpl.class.getName());

    @Override
    public void leaseHouse() {
        log.info("---- 房主 - 租赁房屋 ----");
    }
}
