package com.kodecta.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args){
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");
//        person.speak();
        Zoo animal = (Zoo)context.getBean("zoo");
        Elephant elephant = (Elephant)context.getBean("elephant");
        log.debug(elephant.speak());

        animal.info();
    }
}
