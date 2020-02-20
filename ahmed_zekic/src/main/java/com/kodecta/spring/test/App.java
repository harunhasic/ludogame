package com.kodecta.spring.test;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");
//        person.speak();
        Zoo animal = (Zoo)context.getBean("zoo");
        animal.info();
    }
}
