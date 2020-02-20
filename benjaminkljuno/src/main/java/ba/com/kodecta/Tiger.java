package ba.com.kodecta;

public class Tiger implements Jumps {

    boolean animal;
    String name;

    public Tiger(boolean a, String n) {
        System.out.println("Tiger constructor");
        animal = a;
        name = n;
    }

    void displayAnimal() {
        System.out.println("Is it animal: " + animal + " " + "What animal is it: " + name);
    }

    @Override
    public void jumps() {
        System.out.println("yes, tiger can jump");
    }

    @Override
    public void eat() {
        System.out.println("yes, he eats a lot too");
    }
}
