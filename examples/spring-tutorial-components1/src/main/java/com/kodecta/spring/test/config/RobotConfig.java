package com.kodecta.spring.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/robot.properties")
public class RobotConfig {


    @Value("${robot.age:20}")
    private int age;

    public int getAge() {
        return age;
    }
}
