

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class BankDatabaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BankDatabaseTest
{
    @Test
    public void autenticacionValida() {
        BankDatabase bd = new BankDatabase();
        
        int userAccountNumber1 = 12345;
        int userPin1 = 54321;
        
        int userAccountNumber2 = 98765;
        int userPin2 = 56789;
        
        assertTrue(bd.authenticateUser(userAccountNumber1, userPin1));
        assertTrue(bd.authenticateUser(userAccountNumber2, userPin2));
    }
    
    @Test
    public void testCP04() {
        BankDatabase bd = new BankDatabase();
        double expectAvailableBalance = 1000.0;
        double expectTotalBalance = 1200.0;
        double user1AvailableBalance = bd.getAvailableBalance(12345);
        double user1TotalBalance = bd.getTotalBalance(12345);
        System.out.println(user1TotalBalance);
        assertEquals(expectAvailableBalance, user1AvailableBalance, 0);
        assertEquals(expectTotalBalance, user1TotalBalance , 0);
    }
    
    @Test
    public void autenticacionInvalida() {
        BankDatabase bd = new BankDatabase();
        
        int userAccountNumber = 88888;
        int userPin = 44444;
        
        assertFalse(bd.authenticateUser(userAccountNumber, userPin));
    }
}
