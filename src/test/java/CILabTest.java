import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse(), "Test failed for 'USA'");
    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse(), "Test failed for 'leetcode'");
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse(), "Test failed for 'Google'");
    }

}
