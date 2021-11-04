package Labs.Lab5;

public class Dog extends Pet{
    private String name;
    private String type;
    public Dog(String name, String type) {
        super();
        this.name=name;
        this.type=type;

    }

    @Override
    public String toString() {
        return "the name of the Dog is : " + name + "  and the type is  : "  + type;
    }
}
