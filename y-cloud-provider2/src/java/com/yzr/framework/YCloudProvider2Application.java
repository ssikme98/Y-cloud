package com.yzr.framework;

/**
 * @author zhengrong.yan
 * @date 2022/2/28 16:26
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
public class YCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(YCloudProvider2Application.class, args);
    }

}