package org.example;
public class Main {

    //first name
    public boolean validFirstName(String fName){
        return fName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //last Name
    public boolean validLastName(String lName){
        return lName.matches("^[A-Z][a-zA-Z]{2,}$");
    }

    //Email
    public boolean validEmail(String mail){
        return mail.matches("^[A-Za-z.+-/%&#]+@[a-zA-Z]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
    }
    //phone number
    public boolean validPhone(String phone){
        return phone.matches("^[0-9]{1,}[0-9]{10}$");
    }

    public static void main(String[] args) {
        System.out.println("User Registration Form");
    }

}
