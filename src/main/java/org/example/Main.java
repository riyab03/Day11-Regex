package org.example;
public class Main {

    //first name
    public boolean validFirstName(String fName){
        return fName.matches("^[A-Z][a-zA-Z]{2,}$");
    }


    public static void main(String[] args) {
        System.out.println("User Registration Form");
    }
}
