

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class AccountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AccountTest
{
    /**
     * Default constructor for test class AccountTest
     */
    public AccountTest()
    {
    }
    
    @Test
    public void validPinTest() {
        Account acc = new Account(12345,54321,1000.0,1000.0);
        assertTrue(acc.validatePIN(54321));
    }
    
    @Test
    public void invalidPinTest() {
        Account acc = new Account(12345,54321,1000.0,1000.0);
        assertFalse(acc.validatePIN(12322));
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */


    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    
}
