package Labs.Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pet {
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    /*public Pet() {
        name;
        type=type;

    }*/



    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
