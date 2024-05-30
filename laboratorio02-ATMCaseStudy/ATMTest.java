

import static org.junit.Assert.*;
import org.junit.Test;
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

    BankDatabase bd = new BankDatabase();
    
     @Test
    public void TestCP01() {
        // acc: 12345, pin: 54321
        
        assertTrue(bd.authenticateUser(12345, 54321));
        
    }
    
    @Test
    public void TestCP02() {
        // acc: 12345, pin: 12322
        
        assertFalse(bd.authenticateUser(12345, 12322));
        
    }

    
    @Test
    public void TestCP03() {
        // acc: 12444, pin: 54321
        
        assertFalse(bd.authenticateUser(12444, 54321));
        
    }
}
