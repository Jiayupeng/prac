package com.jupure.prac.register.server.core;

import java.util.Queue;

/**
 * @author : jiayupeng
 * @date : 2020/3/7/18:22
 */
public class DeltaRegistry {

    private Queue<ServiceRegistry.RecentlyChangedServiceInstance> recentlyChangedQueue;
    private Long serviceInstanceTotalCount;

    public DeltaRegistry(Queue<ServiceRegistry.RecentlyChangedServiceInstance> recentlyChangedQueue,
                         Long serviceInstanceTotalCount) {
        this.recentlyChangedQueue = recentlyChangedQueue;
        this.serviceInstanceTotalCount = serviceInstanceTotalCount;
    }

    public Queue<ServiceRegistry.RecentlyChangedServiceInstance> getRecentlyChangedQueue() {
        return recentlyChangedQueue;
    }

    public void setRecentlyChangedQueue(Queue<ServiceRegistry.RecentlyChangedServiceInstance> recentlyChangedQueue) {
        this.recentlyChangedQueue = recentlyChangedQueue;
    }

    public Long getServiceInstanceTotalCount() {
        return serviceInstanceTotalCount;
    }

    public void setServiceInstanceTotalCount(Long serviceInstanceTotalCount) {
        this.serviceInstanceTotalCount = serviceInstanceTotalCount;
    }

}
