package Labs.lab3;

public class AddressBook {
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private String note;

    AddressBook( String  phoneNumber, String emailAddress, Address address, String note){
        this.phoneNumber=phoneNumber;
        this.emailAddress= emailAddress;
        this.address= address;
        this.note=note;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
//  public String toString(){
       // return "NO_ of phone numbers : " + numOfPhoneNumbers + " NO_ of email Addresses : " + numOfEmailAddresses + ""
    //}







}
