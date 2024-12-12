import org.example.CustomException;
import org.example.Main;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testAge() {
        Main m1 = new Main();

        //first name
        try {
            m1.validFirstName("sh");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        try {
            m1.validFirstName("Riya");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }



        //last name
        try {
           m1.validLastName("Bisht");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        try {
            m1.validLastName("Bi");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }


//        email
        try {
            m1.validEmail("acb.cs@abc.com");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        try {
            m1.validEmail("abc@.com.my");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }


//        Phone
        try {
            m1.validPhone("917392826233");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        try {
           m1.validPhone("910282723");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }

        //password
        try {
            m1.validPassword("#Abcd1234");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        try {
            m1.validPassword("#Rbis@3");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }


       String[] CorrectemailSample= {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };
        List<String> IncorrectemailSample=List.of(
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        );
        try {
            m1.validPassword("#Rbis@3");
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }

        for(String email:CorrectemailSample){
            try {
                m1.validEmail(email);
            }catch(CustomException e){
                System.out.println(e.getMessage());
            }
        }
      for(String email:IncorrectemailSample){
          try {
              m1.validEmail(email);
          }catch(CustomException e){
              System.out.println(e.getMessage());
          }
        }
    }
}

