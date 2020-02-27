package com.kodecta.spring.test.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(RobotConfig.class)
@ComponentScan(basePackages = "com.kodecta.spring")
public class AppConfig {

}
