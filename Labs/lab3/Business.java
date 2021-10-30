package Labs.lab3;

public class Business extends AddressBook {
    private String name;

    public Business(String name){
        super( 5,5, new Address("business","1000S.6th st","FF","IA","52556"),"put your additional information here");
        this.name=name;
    }
    @Override
    public String toString(){
        return " The Name of the Business is : " + name;
    }
}
