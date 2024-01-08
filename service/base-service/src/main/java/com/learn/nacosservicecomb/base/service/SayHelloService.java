package com.learn.nacosservicecomb.base.service;

import com.learn.nacosservice.base.api.SayHello;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author：xu
 * @Date：2024-01-05 11:41
 * @Description：hello对应服务类
 */
@RpcSchema(schemaId = "SayHelloService")
public class SayHelloService implements SayHello {

    @Value("${app.name}")
    private String appName;

    /**
     * 传入名字，返回hello+名字
     *
     * @param name 姓名
     * @return 接口返回值
     */
    @Override
    public String hello(String name) {
        return name + "调用了接口";
    }

    /**
     * 获取配置
     *
     * @return 配置信息
     */
    @Override
    public String getConfig() {
        return "appName=" + appName;
    }


}
