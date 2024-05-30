

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class CashDispenserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CashDispenserTest
{
    public final static int CASH_DISPENSER_INITIAL_COUNT = 500;

    @Test
    public void sufficientCashAvailableValido() {
        CashDispenser cd = new CashDispenser();
        
        // Las entradas son el efectivo, no el número de billetes, de ahí la conversión
        assertTrue(cd.isSufficientCashAvailable(1 * 20));
        assertTrue(cd.isSufficientCashAvailable(10 * 20));
        assertTrue(cd.isSufficientCashAvailable(100 * 20));
        assertTrue(cd.isSufficientCashAvailable(200 * 20));
        assertTrue(cd.isSufficientCashAvailable(300 * 20));
        assertTrue(cd.isSufficientCashAvailable(400 * 20));
        assertTrue(cd.isSufficientCashAvailable(499 * 20));
        assertTrue(cd.isSufficientCashAvailable(CASH_DISPENSER_INITIAL_COUNT * 20));
    }
    
    @Test
    public void sufficientCashAvailableInvalido() {
        CashDispenser cd = new CashDispenser();
        
        // Las entradas son el efectivo, no el número de billetes, de ahí la conversión
        assertFalse(cd.isSufficientCashAvailable((CASH_DISPENSER_INITIAL_COUNT + 1) * 20));
        assertFalse(cd.isSufficientCashAvailable(600 * 20));
        assertFalse(cd.isSufficientCashAvailable(1000 * 20));
        assertFalse(cd.isSufficientCashAvailable(10000 * 20));
        assertFalse(cd.isSufficientCashAvailable(100000 * 20));
        assertFalse(cd.isSufficientCashAvailable(1000000 * 20));
        assertFalse(cd.isSufficientCashAvailable(10000000 * 20));
        assertFalse(cd.isSufficientCashAvailable(100000000 * 20));
    }
}
