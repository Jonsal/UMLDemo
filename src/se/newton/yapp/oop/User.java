package se.newton.yapp.oop;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String passWord;
    private Date birthDate;
    private Address address;
    private String email;
    
    public User(String name, String passWord, Date birthDate, String email, String streetName, String streetNumber, String zipCode, String country){
        this.id = 1; // - hårdkodat
        this.name = name;
        this.passWord = passWord;
        this.birthDate = birthDate;
        Address userAddress = new Address(streetName, streetNumber, zipCode, country);
        this.address = userAddress;
        this.email = email;
    }
    
    public User(){
    
    }
    
    public boolean login(String email, String passWord){
        if(email == "address@mail.com" && passWord == "hemligt"){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean signUp(User user){
        //TODO: implement database persitance etc
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
