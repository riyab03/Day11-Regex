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


    }
}

