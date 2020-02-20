package com.kodecta.tutorial1;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static final Logger log = (Logger) LoggerFactory.getLogger(Zoo.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");

//        Person person = (Person) applicationContext.getBean("person");
//        person.helloWorld();

        Zoo zoo = (Zoo) applicationContext.getBean("zoo");
        log.debug(zoo.getZooName());
        zoo.getTiger().speak();

        System.out.println("--------------------------");

        Zoo zoo2 = (Zoo) applicationContext.getBean("zoo2");
        System.out.println(zoo2.getZooName());
        zoo2.getElephant().speak();
    }
}
