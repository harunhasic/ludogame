package ba.com.kodecta;

public class Animals {

    private String animalName;
    private int age;

    public Animals(String an, int a) {
        animalName = an;
        age = a;
    }

    public String toString() {
        return "Animal name=" + animalName + ",Age=" + age;
    }
}
