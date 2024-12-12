import org.example.Main;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testAge() {
        Main m1 = new Main();

        //first name
        assertTrue(m1.validFirstName("Riya"));
        assertFalse(m1.validFirstName("Sh"));
        assertFalse(m1.validFirstName("riya"));
        assertTrue(m1.validFirstName("Riy"));


        //last name
        assertTrue(m1.validLastName("Bisht"));
        assertFalse(m1.validLastName("Bi"));
        assertFalse(m1.validLastName("bisht"));
        assertTrue(m1.validLastName("Bis"));

        //email
        assertTrue(m1.validEmail("riya@gmail.com"));
        assertTrue(m1.validEmail("bisht.com@gmail.co.in"));
        assertFalse(m1.validEmail("Bis.com#co@gmail"));



    }
}

