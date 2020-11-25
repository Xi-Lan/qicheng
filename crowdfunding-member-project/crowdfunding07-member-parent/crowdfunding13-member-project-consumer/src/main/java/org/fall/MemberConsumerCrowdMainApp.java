package org.fall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MemberConsumerCrowdMainApp {
    public static void main(String[] args) {
        SpringApplication.run(MemberConsumerCrowdMainApp.class,args);
    }
}
