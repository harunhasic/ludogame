package com.kodecta.spring.test;


import com.kodecta.spring.test.config.RobotConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	@Autowired
	RobotConfig robotConfig;

	
	public void speak() {
		System.out.println(robotConfig.getAge() + ": years old");
	}

	public void speakAgain() {
		System.out.println("As you already know, my age : " + robotConfig.getAge() + ": years old");
	}
	
}
