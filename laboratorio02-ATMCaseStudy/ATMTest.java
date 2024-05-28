import org.junit.Test;
import static org.junit.Assert.*;
/**
 * The test class ATMTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ATMTest
{
    
    /**
     * Default constructor for test class ATMTest
     */
    public ATMTest()
    {
    }
    
    @Test
    public void TestCP01() {
        // acc: 12345, pin: 54321
        ATM atm = new ATM();
        atm.authenticateUser();
        assertTrue(atm.userAuthenticated);
        
    }
    
    @Test
    public void TestCP02() {
        // acc: 12345, pin: 12322
        ATM atm = new ATM();
        atm.authenticateUser();
        assertFalse(atm.userAuthenticated);
        
    }

    
    @Test
    public void TestCP03() {
        // acc: 12444, pin: 54321
        ATM atm = new ATM();
        atm.authenticateUser();
        assertFalse(atm.userAuthenticated);
        
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
