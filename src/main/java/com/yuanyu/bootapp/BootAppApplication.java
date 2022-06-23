package com.yuanyu.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class BootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAppApplication.class, args);
    }

}
