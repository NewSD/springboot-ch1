package com.niu.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//开启自动化配置和包扫描 GitHub上修改
//@SpringBootApplication=@EnableAutoConfiguration + @ComponentScan
public class SpringbootCh1Application {

    public static void main(String[] args) {
//        关闭banner
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootCh1Application.class);
        builder.application().setAdditionalProfiles("prod");
        builder.bannerMode(Banner.Mode.OFF).run(args);

//        SpringApplication.run(SpringbootCh1Application.class, args);
    }

}
