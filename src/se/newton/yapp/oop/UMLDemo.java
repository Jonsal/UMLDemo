package se.newton.yapp.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UMLDemo {
    public static void main(String[] args) throws ParseException {
        
        // login:
        User user1 = new User();
        if(user1.login("address@mail.com", "hemligt")){
            System.out.println("Inloggad!");
        } else {
            System.out.println("Inloggnigen misslyckades");
        }
        
        // signup:       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "1970-09-12";
        Date birthdate = sdf.parse(dateInString);
        User user2 = new User("Jonas", "hemligt", birthdate , "address@mail.com", "Gatan", "1", "12345", "Sverige");
              
        if(user2.signUp(user2)){
            System.out.println("Användaren registrerad!");
        }
    }
    
}
