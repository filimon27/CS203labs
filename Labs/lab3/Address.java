package Labs.lab3;

public class Address {
    private String type;
    private String street;
    private String city;
    private String state;
    private String zip;

     public Address(String type, String street, String city,String state, String zip){
         this.type=type;
         this.street=street;
         this.city=city;
         this.zip=zip;
     }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
