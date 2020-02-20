package com.kodecta.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Zoo {

    public static void main(String[] args){

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Tiger tiger = context.getBean("tiger", Tiger.class);
        System.out.println("Tiger " + tiger.getName() + " says: " + tiger.getSound());

        Elephant elephant = context.getBean("elephant", Elephant.class);
        System.out.println("Elephant " + elephant.getName() + " says: " + elephant.getSound());

        System.out.println("They are both wrong...");
    }
}
