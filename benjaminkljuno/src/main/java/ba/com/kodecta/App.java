package ba.com.kodecta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;

public class App {

    public static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        // Person
        Person person = (Person) context.getBean("person");
        log.debug(person.speak());
        person.speak();
        person.displayPerson();

        // Tiger
        Tiger tiger = (Tiger) context.getBean("tiger");
        tiger.displayAnimal();
        tiger.jumps();

        // Elephant
        Elephant elephant = new Elephant(true, "elephant");
        elephant.setName("I'm elephant");
        // System.out.println(elephant.getName());
        log.debug(elephant.getName());

        elephant.eat();

        // Creating user-defined class objects
        Animals tiger1 = new Animals("Tiger", 5);
        Animals elephant1 = new Animals("Elephant", 6);

        ArrayList<Animals> animalsArrayList = new ArrayList<Animals>();
        animalsArrayList.add(tiger1);
        animalsArrayList.add(elephant1);

        System.out.println("Animals array list");
        for (Animals an : animalsArrayList) {
            System.out.println(an);
        }
    }
}
