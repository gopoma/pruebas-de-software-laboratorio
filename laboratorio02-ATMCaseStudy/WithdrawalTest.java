
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The test class WithdrawalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class WithdrawalTest
{
    /**
     * Default constructor for test class WithdrawalTest
     */
    public WithdrawalTest()
    {
    }
    
    private int currentAccountNumber = 12345;
    private Screen screen = new Screen();
    private Keypad keypad = new Keypad();
    private CashDispenser cashDispenser = new CashDispenser();
    private DepositSlot depositSlot = new DepositSlot();
    private BankDatabase bankDatabase = new BankDatabase();
    private Transaction temp;
    
    @Before
    public void setUp() {
        temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
        temp.execute();
        temp = null;
    }
    
    @Test
    public void testCP10() {
        BankDatabase bankDatabaseAux = new BankDatabase();
        bankDatabaseAux.debit(12345, 1200);
        temp = new Withdrawal(12345, screen, bankDatabaseAux, keypad, cashDispenser);
        temp.execute();
        double currAmount = bankDatabaseAux.getTotalBalance(12345);
        screen.dispalyDollarAmount(currAmount);
        assertEquals(0.00, currAmount, 1.0);
    }
    
    @Test
    public void testCP09() {
        double currAmount = bankDatabase.getTotalBalance(12345);
        screen.dispalyDollarAmount(currAmount);
        assertEquals(1000.00, currAmount, 1.0);
    }
    
    @Test
    public void testCP08() {
        double currAmount = bankDatabase.getTotalBalance(12345);
        screen.dispalyDollarAmount(currAmount);
        assertEquals(1100.00, currAmount, 1.0);
    }
    
    @Test
    public void testCP07() {
        double currAmount = bankDatabase.getTotalBalance(12345);
        screen.dispalyDollarAmount(currAmount);
        assertEquals(1140.00, currAmount, 1.0);
    }
    
    @Test
    public void testCP06() {
        double currAmount = bankDatabase.getTotalBalance(12345);
        screen.dispalyDollarAmount(currAmount);
        assertEquals(1160.00, currAmount, 1.0);
    }
    
    @Test
    public void testCP05() {
        double currAmount = bankDatabase.getTotalBalance(12345);
        screen.dispalyDollarAmount(currAmount);
        assertEquals(1180.00, currAmount, 1.0);
    }   
}
