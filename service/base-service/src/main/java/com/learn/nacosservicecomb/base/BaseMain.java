package com.learn.nacosservicecomb.base;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BaseMain {

    public static void main(String[] args) {
        try {
            // WebApplicationType.SERVLET 高性能模式
            // WebApplicationType.NONE Spring Boot自带的Tomcat或者Jetty服务器。(需引入容器依赖 spring-boot-starter-tomcat或者spring-boot-starter-jetty)
            new SpringApplicationBuilder()
                    .web(WebApplicationType.SERVLET)
                    .sources(BaseMain.class)
                    .run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
