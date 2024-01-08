package com.learn.nacosservicecomb.manage.controller;

import com.learn.nacosservice.base.api.SayHello;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author：xu
 * @Date：2024-01-08 10:22
 * @Description：测试controller
 */
@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

    @RpcReference(microserviceName = "base-service", schemaId = "SayHelloService")
    private SayHello sayHelloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(HttpServletRequest req) {
        log.info("TestController.hello.start");
        String name = req.getParameter("name");
        return sayHelloService.hello(name);
    }

    @ResponseBody
    @RequestMapping("/getConfig")
    public String getConfig(HttpServletRequest req) {
        log.info("TestController.getConfig.start");
        return sayHelloService.getConfig();
    }
}
