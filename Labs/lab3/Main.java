package Labs.lab3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person>personList= new ArrayList<Person>();
        List<Business>businessList= new ArrayList<Business>();

        Person collegeFriend1= new Person("Nebiyu","Zewdie","345678901", "Zewdie@miu.edu",new Address("home","1000N5th","FF","IA","52557"),"Football lover");
        Person collegeFriend2= new Person("Taye", "Lemma","56740092", "lemmma@miu.edu",new Address("home","1000N5th","FF","IA","52557"),"Football lover");
        Person dad=new Person("Dada","Aradaw","2518890038","ihavenone@gmail.com",new Address("home","bole road","bole","Addis","0986"),"Zena moodu new");
        Person mom= new Person("mommy","fekir","2519647758","iuseYedadan@gmail.com",new Address("home","bole road","bole","addis","0986"),"church ena edir");

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

         Business gasStation= new Business("loglis","6758994","loglis@gasstation.com", new Address("business","N4th","FF","IA","522556"),"we deliver the best gases");
         Business mexicanGrill= new Business("Arandas","657849940","arandas@yahoo.com", new Address("business","N4th","FF","IA","522556"),"We serve the best mexican food in the FF");
         Business autoRepair= new Business("RPM","890111233","rpm@rpm.com",new Address("business","N5th","FF","IA","522554"),"we repair your car as our own");

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
