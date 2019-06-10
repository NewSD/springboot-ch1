package com.niu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//开启自动化配置和包扫描
//@SpringBootApplication=@EnableAutoConfiguration + @ComponentScan
public class SpringbootCh1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCh1Application.class, args);
    }

}
