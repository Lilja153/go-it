package module8;
public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
