package com.uzykj.async;

import com.uzykj.config.ZkClient;
import com.uzykj.utils.ConfigProperties;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;

/**
 * zk异步操作
 *
 * @author ghostxbh
 * @date 2019-11-01
 */
public class ZkAsync {
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
     * 响应码	    意义
     * 0	    OK，即调用成功
     * -4	    ConnectionLoss，即客户端与服务端断开连接
     * -110	    NodeExists，即节点已经存在
     * -112	    SessionExpired，即会话过期
     * @param path
     * @param createMode
     * @param data
     * @param actionType
     * @throws Exception
     */
    public static void action(String path, CreateMode createMode, String data, String actionType) throws Exception {
        switch (actionType) {
            case CREATE:
                if (data == null) {
                    client.create().creatingParentsIfNeeded()
                            .withMode(createMode)
                            .inBackground((curatorFramework, curatorEvent) -> System.out.println(String.format("eventType:%s,resultCode:%s", curatorEvent.getType(), curatorEvent.getResultCode())))
                            .forPath(path);
                } else {
                    client.create().creatingParentsIfNeeded()
                            .withMode(createMode)
                            .inBackground((curatorFramework, curatorEvent) -> System.out.println(String.format("eventType:%s,resultCode:%s", curatorEvent.getType(), curatorEvent.getResultCode())))
                            .forPath(path, data.getBytes(UTF_ChARACTER));
                }
                break;
            case DELETE:
                client.delete().inBackground((curatorFramework, curatorEvent) -> System.out.println(String.format("eventType:%s,resultCode:%s", curatorEvent.getType(), curatorEvent.getResultCode())))
                        .forPath(path);
                break;
            case UPDATE:
                client.setData()
                        .inBackground((curatorFramework, curatorEvent) -> System.out.println(String.format("eventType:%s,resultCode:%s", curatorEvent.getType(), curatorEvent.getResultCode())))
                        .forPath(path, data.getBytes(UTF_ChARACTER));
                break;
        }
    }
}
