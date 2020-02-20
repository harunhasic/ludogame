package ba.com.kodecta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

    public static final Logger log = LoggerFactory.getLogger(App.class);

    String name;

    public Person(String n) {
        name = n;
    }

    public String speak() {
        return "person can speak";
    }

    public void displayPerson() {
        System.out.println("Name: "  + name);
    }


}
