package Labs.lab3;

public class Person extends AddressBook{
     private String fName;
     private String lName;

     public Person(String fName,String lName){
         super(4,3,new Address("home","1000N.5th st","FF","IA","52557"),"put your additional information here");
         this.fName=fName;
         this.lName=lName;

     }

     @Override
    public String toString(){
        return " The First Name is : " + fName + " and Last Name is :" + lName ;
    }

}
