package Labs.lab3;

public class Person extends AddressBook{
     private String fName;
     private String lName;

     public Person(String fName,String lName,String phoneNumber, String emailAddress, Address address, String note ){
         super(phoneNumber,emailAddress,address,note);
         this.fName=fName;
         this.lName=lName;

     }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString(){
        return " The First Name is : " + fName + " and Last Name is :" + lName ;
    }

}
