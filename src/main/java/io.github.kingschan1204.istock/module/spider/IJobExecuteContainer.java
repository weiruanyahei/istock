package io.github.kingschan1204.istock.module.spider;

/**
 * 任务执行容器
 * @author chenguoxiang
 * @create 2019-09-18 17:09
 **/
public interface IJobExecuteContainer {

    /**
     * 线程池情况展示 类似于linux top
     * @return
     */
    String top();

    /**
     * 关闭线程（非强制模式）
     */
    void shutDown();

    /**
     * 关闭线程强制模式
     */
    void forceShutDown();
}
