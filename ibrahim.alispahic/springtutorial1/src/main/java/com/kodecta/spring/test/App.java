package com.kodecta.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("/src/beans.xml");

        Person person = (Person) context.getBean("person");

        log.debug(person.speak());

        Zoo zoo = context.getBean("zoo", Zoo.class);
        zoo.getElephant();

        Tiger tiger = context.getBean("tiger", Tiger.class);
        System.out.println(tiger);

    }
}