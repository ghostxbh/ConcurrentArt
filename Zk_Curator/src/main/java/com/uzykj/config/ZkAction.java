package com.uzykj.config;

import com.uzykj.utils.ConfigProperties;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.CreateMode;

import java.util.List;

/**
 * zk操作
 *
 * @author ghostxbh
 * @date 2019-10-31
 */
public class ZkAction {

    private static final String UTF_ChARACTER = "UTF-8";
    private static CuratorFramework client;

    static {
        client = ZkClient.getClient(ConfigProperties.getServerConfig());
        client.start();
    }

    /**
     * 判断是否存在节点
     *
     * @param path
     * @return
     * @throws Exception
     */
    public static boolean isExists(String path) throws Exception {
        return client.checkExists().forPath(path) == null ? true : false;
    }

    /**
     * 创建节点 | 添加数据
     * Zookeeper的节点创建模式（CreateMode）：
     * PERSISTENT：              持久化
     * PERSISTENT_SEQUENTIAL：   持久化并且带序列号
     * EPHEMERAL：               临时
     * EPHEMERAL_SEQUENTIAL：    临时并且带序列号
     *
     * @param path
     * @param createMode
     * @param data
     * @throws Exception
     */
    public static void createData(String path, CreateMode createMode, String data) throws Exception {
        if (data == null) {
            client.create().withMode(createMode).forPath(path);
        } else {
            client.create().withMode(createMode).forPath(path, data.getBytes(UTF_ChARACTER));
        }
    }

    /**
     * 更新数据
     *
     * @param path
     * @param data
     * @throws Exception
     */
    public static void updateData(String path, String data) throws Exception {
        client.setData().forPath(path, data.getBytes(UTF_ChARACTER));
    }

    /**
     * 删除一个节点
     *
     * @param path
     * @throws Exception
     */
    public static void delNode(String path) throws Exception {
        client.delete().forPath(path);
    }

    /**
     * 删除一个节点，递归删除下面的叶子结点
     *
     * @param path
     * @throws Exception
     */
    public static void delChildrenNode(String path) throws Exception {
        client.delete().deletingChildrenIfNeeded().forPath(path);
    }

    /**
     * 删除版本号节点
     *
     * @param path
     * @param version
     * @throws Exception
     */
    public static void delVersion(String path, int version) throws Exception {
        client.delete().withVersion(version).forPath(path);
    }

    /**
     * 保证删除节点
     *
     * @param path
     * @throws Exception
     */
    public static void delGuarant(String path) throws Exception {
        client.delete().guaranteed().forPath(path);
    }

    /**
     * 获取数据
     *
     * @param path
     * @return
     * @throws Exception
     */
    public static String getData(String path) throws Exception {
        byte[] data = client.getData().forPath(path);
        return new String(data, UTF_ChARACTER);
    }

    /**
     * 获取子节点数据
     *
     * @param path
     * @return
     * @throws Exception
     */
    public static List<String> getChildrenData(String path) throws Exception {
        return client.getChildren().watched().forPath(path);
    }
}
