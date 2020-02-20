package ba.com.kodecta;

public class Person {

    String name;

    public Person(String n) {
        name = n;
    }

    public String speak() {
        return "person can speak";
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
    }

}
