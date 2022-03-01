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
public class YCloudProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(YCloudProvider1Application.class, args);
    }

}