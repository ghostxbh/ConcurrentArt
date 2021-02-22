package com.uzykj.transaction;

import com.uzykj.config.ZkClient;
import com.uzykj.utils.ConfigProperties;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.api.transaction.CuratorTransactionFinal;
import org.apache.zookeeper.CreateMode;

/**
 * zk数据事务操作
 *
 * @author ghostxbh
 * @date 2019-10-31
 */
public class ZkTransaction {

    private static final String UTF_ChARACTER = "UTF-8";
    private static CuratorFramework client;

    private static final String CREATE = "create";
    private static final String DELETE = "delete";
    private static final String UPDATE = "update";

    static {
        client = ZkClient.getClient(ConfigProperties.getServerConfig());
        client.start();
    }

    /**
     * 事务执行动作
     * @param path          路径
     * @param createMode    节点类型
     * @param data          数据信息
     * @param actionType    操作类型
     * @throws Exception
     */
    public static void action(String path, CreateMode createMode, String data, String actionType) throws Exception {
        CuratorTransactionFinal action = null;
        action = client.inTransaction().check().forPath(path)
                .and();
        switch (actionType) {
            case CREATE:
                if (data == null) {
                    action.create().withMode(createMode).forPath(path).and();
                } else {
                    action.create().withMode(createMode).forPath(path, data.getBytes(UTF_ChARACTER)).and();
                }
                break;
            case DELETE:
                action.delete().forPath(path).and();
                break;
            case UPDATE:
                action.setData().forPath(path, data.getBytes(UTF_ChARACTER)).and();
                break;
        }
        action.commit();
    }
}
