package Labs.lab3;

public class Business extends AddressBook {
    private String name;

    public Business(String name,String phoneNumber, String emailAddress, Address address, String note){
        super( phoneNumber,emailAddress,address,note);
        this.name=name;
    }
    @Override
    public String toString(){
        return " The Name of the Business is : " + name;
    }
}
