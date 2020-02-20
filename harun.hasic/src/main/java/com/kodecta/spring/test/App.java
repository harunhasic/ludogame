package com.kodecta.spring.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class App {

    public static final Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {


        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

      Zoo zoo=(Zoo)context.getBean("zoo");
      Tiger tiger=(Tiger)context.getBean("tiger");
      Elephant elephant=(Elephant)context.getBean("elephant");

      zoo.printAnimals(tiger, elephant);

      log.debug(zoo.printAnimals(tiger,elephant));

    }
}
