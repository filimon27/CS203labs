package Labs.Lab5;

public class Cat extends Pet{
    private String name;
    private String type;
    public Cat(String name, String type) {
        super();
        this.name=name;
        this.type=type;
    }

    @Override
    public String toString() {
        return  "the name of the Cat is : " + name + "  and the type is : "  + type;
    }
}
