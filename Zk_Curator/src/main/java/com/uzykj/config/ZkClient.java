package com.uzykj.config;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * zk连接实例
 *
 * @author ghostxbh
 * @date 2019-10-31
 */
public class ZkClient {

    private static ZkClient instance;
    private static volatile CuratorFramework client;

    /**
     * @param baseSleepTimeMs     基础睡眠时间，单位毫秒
     * @param maxRetries          重连次数
     * @param connectionInfo      服务器列表，格式host1:port1,host2:port2
     * @param sessionTimeoutMs    会话过期时间，单位毫秒
     * @param connectionTimeoutMs 连接过期时间，单位毫秒
     */
    public ZkClient(int baseSleepTimeMs, int maxRetries, String connectionInfo, int sessionTimeoutMs, int connectionTimeoutMs) {
        // 重试策略,内建有四种重试策略,也可以自行实现RetryPolicy接口
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(baseSleepTimeMs, maxRetries);
        client = CuratorFrameworkFactory.builder()
                .connectString(connectionInfo)
                .sessionTimeoutMs(sessionTimeoutMs)
                .connectionTimeoutMs(connectionTimeoutMs)
                .retryPolicy(retryPolicy)
                .build();
    }

    /**
     * @param baseSleepTimeMs     基础睡眠时间，单位毫秒
     * @param maxRetries          重连次数
     * @param connectionInfo      服务器列表，格式host1:port1,host2:port2
     * @param sessionTimeoutMs    会话过期时间，单位毫秒
     * @param connectionTimeoutMs 连接过期时间，单位毫秒
     * @param namespace           命名空间
     */
    public ZkClient(int baseSleepTimeMs, int maxRetries, String connectionInfo, int sessionTimeoutMs, int connectionTimeoutMs, String namespace) {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(baseSleepTimeMs, maxRetries);
        client = CuratorFrameworkFactory.builder()
                .connectString(connectionInfo)
                .sessionTimeoutMs(sessionTimeoutMs)
                .connectionTimeoutMs(connectionTimeoutMs)
                .retryPolicy(retryPolicy)
                .namespace(namespace)
                .build();
    }

    /**
     * 获取单例对象
     *
     * @param connectionInfo 连接信息
     */
    public static void getInstance(String connectionInfo) {
        if (instance == null) {
            synchronized (ZkClient.class) {
                if (instance == null) {
                    new ZkClient(1000, 3, connectionInfo, 5000, 5000);
                }
            }
        }
    }

    /**
     * 获取单例对象
     *
     * @param connectionInfo 连接信息
     * @param namespace      命名空间
     */
    public static void getInstance(String connectionInfo, String namespace) {
        if (instance == null) {
            synchronized (ZkClient.class) {
                if (instance == null) {
                    instance = new ZkClient(1000, 3, connectionInfo, 5000, 5000, namespace);
                }
            }
        }
    }

    /**
     * 获取zkClient实例
     *
     * @param connectionInfo
     * @return
     */
    public static CuratorFramework getClient(String connectionInfo) {
        if (client == null) {
            getInstance(connectionInfo);
        }
        return client;
    }

    /**
     * 获取zkClient实例
     *
     * @param connectionInfo
     * @param namespace
     * @return
     */
    public static CuratorFramework getClient(String connectionInfo, String namespace) {
        if (client == null) {
            getInstance(connectionInfo, namespace);
        }
        return client;
    }
}
