package org.fall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.fall.mapper")
@SpringBootApplication
public class MysqlCrowdMainApp {

    public static void main(String[] args) {
        SpringApplication.run(MysqlCrowdMainApp.class, args);
    }
}
