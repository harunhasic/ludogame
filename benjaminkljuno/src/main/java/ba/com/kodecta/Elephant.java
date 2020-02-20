package ba.com.kodecta;

public class Elephant extends Tiger {
    private String name;

    public Elephant(boolean a, String n) {
        super(a, n);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
