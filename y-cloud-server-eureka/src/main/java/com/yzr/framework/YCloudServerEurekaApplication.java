package com.yzr.framework;

/**
 * @author zhengrong.yan
 * @date 2022/2/28 16:26
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //标明是一个server
public class YCloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YCloudServerEurekaApplication.class, args);

        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }

}