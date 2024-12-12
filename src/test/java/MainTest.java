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
        //happy test case
        assertTrue(m1.validFirstName("Riya"));
        assertTrue(m1.validFirstName("Riy"));
        //sad test case
        assertFalse(m1.validFirstName("Sh"));
        assertFalse(m1.validFirstName("riya"));



        //last name
        //happy test case
        assertTrue(m1.validLastName("Bisht"));
        assertTrue(m1.validLastName("Bis"));
        //sad test case
        assertFalse(m1.validLastName("Bi"));
        assertFalse(m1.validLastName("bisht"));


//        email
        //happy test case
        assertTrue(m1.validEmail("acb.cs@abc.com"));
        assertTrue(m1.validEmail("abc+100@gmail.com.com"));
        //sad test case
        assertFalse(m1.validEmail("abc@.com.my"));


//        Phone
        //happy test case
        assertTrue(m1.validPhone("917392826233"));
        assertTrue(m1.validPhone("019028272332"));
        //sad test case
        assertFalse(m1.validPhone("910282723"));

        //password
        //Happy test case
        assertTrue(m1.validPassword("#Abcd1234"));
        assertTrue(m1.validPassword("ishBHSGD@gmai3"));
        //sad test case
        assertFalse(m1.validPassword("Rbis@3"));


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
        //happy test case
        for(String email:CorrectemailSample){
            System.out.println(email);
            assertTrue(m1.validEmail(email));
        }
        //sad test case
      for(String email:IncorrectemailSample){
            System.out.println(email);
            assertFalse(m1.validEmail(email));
        }
    }
}

