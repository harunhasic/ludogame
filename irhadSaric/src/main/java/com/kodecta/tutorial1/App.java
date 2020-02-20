package com.kodecta.tutorial1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");

//        Person person = (Person) applicationContext.getBean("person");
//        person.helloWorld();

        Zoo zoo = (Zoo) applicationContext.getBean("zoo");
        System.out.println(zoo.getZooName());
        zoo.getTiger().speak();

        System.out.println("--------------------------");

        Zoo zoo2 = (Zoo) applicationContext.getBean("zoo2");
        System.out.println(zoo2.getZooName());
        zoo2.getElephant().speak();
    }
}
