package Labs.lab3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person>personList= new ArrayList<Person>();
        List<Business>businessList= new ArrayList<Business>();

        Person collegeFriend1= new Person("Nebiyu","Zewdie");
        Person collegeFriend2= new Person("Taye", "Lemma");
        Person dad=new Person("Dada","Aradaw");
        Person mom= new Person("mommy","fekir");

        personList.add(collegeFriend1);
        personList.add(collegeFriend2);
        personList.add(dad);
        personList.add(mom);
         for( Person p: personList)
             System.out.println(p.toString());

        System.out.println("-----    ----- ------ ------");

        personList.set(0,dad);
        personList.remove(collegeFriend2);

        for( Person p: personList)
            System.out.println(p.toString());

        System.out.println("-----    ----- ------ ------");

         Business gasStation= new Business("Loglis");
         Business mexicanGrill= new Business("Arandas");
         Business autoRepair= new Business("RPM");

         businessList.add(gasStation);
         businessList.add(mexicanGrill);
         businessList.add(autoRepair);

         for( Business b: businessList)
             System.out.println(b.toString());

        System.out.println("-----    ----- ------ ------");

        businessList.set(0,autoRepair);
         businessList.remove(mexicanGrill);

        for( Business b: businessList)
            System.out.println(b.toString());








    }
}
