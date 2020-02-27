package com.kodecta.spring.test;

import com.kodecta.spring.test.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {



	public static void main(String[] args) {

		ConfigurableApplicationContext context
				= new AnnotationConfigApplicationContext(AppConfig.class);


		Robot robot = (Robot) context.getBean("robot");
		robot.speak();

	}

}
