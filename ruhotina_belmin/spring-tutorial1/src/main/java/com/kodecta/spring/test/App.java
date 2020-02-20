package com.kodecta.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        //Person person = (Person) context.getBean("person");
        //person.speak();

        Tiger tiger = (Tiger) context.getBean("tiger_constructor");
        System.out.println(tiger.getName());
        System.out.println(tiger.getColor());

        Tiger tiger1 = (Tiger) context.getBean("tiger_properties");
        System.out.println(tiger1.getName());
        System.out.println(tiger1.getColor());







    }
}
