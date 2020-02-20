package ba.com.kodecta;

import java.util.ArrayList;

public class Person {

    String name;

    public Person(String n) {
        name = n;
    }

    public void speak() {
        System.out.println("Person speaks");
    }

    public void displayPerson() {
        System.out.println("Name: "  + name);
    }


}
