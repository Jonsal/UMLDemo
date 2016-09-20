package se.newton.yapp.oop;

public class Address {
    private String streetName;
    private String streetNumber;
    private String zipCode;
    private String country;
    
    public Address(String streetName, String streetNumber, String zipCode, String country){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.country = country;
    }
    
    public Address getAddress(int userId){
        //gör inget med userID - hårdkodat för test...
        return new Address("Gatan", "1", "12345", "Sverige");    
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
