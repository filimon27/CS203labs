package Labs.Lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Dog> dogList = new ArrayList<Dog>();
        List<Cat>catList=new ArrayList<Cat>();

        System.out.println("Please enter pet name: Either Dog or Cat");
        String name= scanner.nextLine();

        while( !name.equalsIgnoreCase("stop")){

        if(name.equalsIgnoreCase("Dog")) {
            dogList.add(new Dog("Puppy","d"));
            dogList.add(new Dog("buchy","d"));
            for(Dog dog : dogList ){
                System.out.println(dog);
            }
        }else if(name.equalsIgnoreCase("cat")) {
            catList.add(new Cat("Pussy","c"));
            catList.add(new Cat("wuro","c"));
            for(Cat cat : catList){
                System.out.println(cat);
            }
        }

        System.out.println("Please enter pet name: Either Dog or Cat");
          name= scanner.nextLine();
        }





    }
}
