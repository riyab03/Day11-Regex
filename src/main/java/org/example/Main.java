package org.example;

import java.util.List;

public class Main {

    //first name
    public boolean validFirstName(String fName) throws CustomException{
        if(fName.matches("^[A-Z][a-zA-Z]{2,}$")){
            System.out.println("Valid First Name");
        }else{
            throw new CustomException("Invalid First Name");
        }
        return true;
    }

    //last Name
    public boolean validLastName(String lName) throws CustomException{
        if(lName.matches("^[A-Z][a-zA-Z]{2,}$")){
            System.out.println("Valid Last Name");
        }
        else{
            throw new CustomException("Invalid Last Name");
        }
        return true;
    }

    //Email
    public boolean validEmail(String mail) throws CustomException{
        if(mail.matches("^[A-Za-z0-9]+[+/%&#.-]?[A-Za-z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$")){
            System.out.println("Valid Email");
        }
        else{
            throw new CustomException("Invalid Email");
        }
        return true;
    }
    //phone number
    public boolean validPhone(String phone) throws CustomException {
        if (phone.matches("^[0-9]{1,}[0-9]{10}$")) {
            System.out.println("Valid Phone number");
        } else {
            throw new CustomException("Invalid Phone number");
        }
        return true;
    }

    //password
    public boolean validPassword(String pswrd) throws  CustomException{
        String r1="^.{8,}$";
//        String r2="^(.*[A-Z].*)$";
//        String r3="^(.*[0-9].*)$";
        String r4="^([^@#$%^&+=!]*[@#$%^&+=!][^@#$%^&+=!]*)$";
        if((pswrd.matches(r1) && pswrd.matches(r4))){
            System.out.println("Valid Password");
        }else{
            throw new CustomException("Invalid Password");
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("User Registration Form");
    }

}
