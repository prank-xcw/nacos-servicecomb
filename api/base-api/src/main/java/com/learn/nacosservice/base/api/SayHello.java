package com.learn.nacosservice.base.api;

/**
 * @Author：xu
 * @Date：2024-01-05 11:39
 * @Description：hello测试服务
 */
public interface SayHello {

    /**
     * 传入名字，返回hello+名字
     *
     * @param name 姓名
     * @return 接口返回值
     */
    String hello(String name);

    /**
     * 获取配置
     *
     * @return 配置信息
     */
    String getConfig();
}
