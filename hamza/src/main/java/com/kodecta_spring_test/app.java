package com.kodecta_spring_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class app {
    public static void main(String[] args) {

        ApplicationContext context = new  FileSystemXmlApplicationContext("beans.xml");
        ApplicationContext context1 = new FileSystemXmlApplicationContext("beans.xml");
        person Person = (person)context.getBean("person");
        Person.speak();
        zoo animal = (zoo)context1.getBean("zoo");
        System.out.println(animal);
        animal.setAnimal("Lion");
        animal.getAnimal();
        animal.toString();



    }
}


