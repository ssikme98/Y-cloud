package com.yzr.framework;

/**
 * @author zhengrong.yan
 * @date 2022/2/28 17:47
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YCloudConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YCloudConsumerApplication.class, args);
    }

}
