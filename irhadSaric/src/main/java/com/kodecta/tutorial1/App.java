package com.kodecta.tutorial1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");

        Person person = (Person) applicationContext.getBean("person");

    }
}
