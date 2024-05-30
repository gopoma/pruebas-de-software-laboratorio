

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
    public void instanciacion() {
        // Datos para la instancia de Account
        int accountNumber = 12345;
	    int pin = 56789;
	    double availableBalance = 75.25;
	    double totalBalance = 100.25;
        
        // Instanciación
        Account a = new Account(accountNumber, pin, availableBalance, totalBalance);
        
        // Verificar que el constructor mapeó correctamente hacia los atributos de la instancia
        assertTrue(a.getAccountNumber() == accountNumber);
        assertTrue(a.getAvailableBalance() == availableBalance);
        assertTrue(a.getTotalBalance() == totalBalance);
        
        // Validación del campo privado PIN
        assertTrue(a.validatePIN(pin));
        assertFalse(a.validatePIN(88888));
    }
    
    @Test
    public void PINValido() {
        Account a = new Account(12345, 54321, 1000.0, 1000.0);
        
        assertTrue(a.validatePIN(54321));
    }
    
    @Test
    public void PINInvalido() {
        Account a = new Account(12345, 54321, 1000.0, 1000.0);
        
        assertFalse(a.validatePIN(12322));
    }
    
    @Test
    public void creditDeberiaActualizarTotalBalance() {
        Account a = new Account(12345, 56789, 75.25, 100.25);
        
        double prevTotalBalance = a.getTotalBalance();
        double amount = 40; // Incremento
        
        a.credit(amount); // Deposito
        
        assertTrue(prevTotalBalance < a.getTotalBalance()); // Debería aumentar el totalBalance
        assertTrue(a.getTotalBalance() == prevTotalBalance + amount); // Debería cumplirse la siguiente relación
    }
    
    @Test
    public void depitDeberiaActualizarBalance() {
        Account a = new Account(12345, 56789, 75.25, 100.25);
        
        double prevAvailableBalance = a.getAvailableBalance();
        double prevTotalBalance = a.getTotalBalance();
        double amount = 60; // Decremento
        
        a.depit(amount); // Retiro
        
        // availableBalance y totalBalance deberían disminuir
        assertTrue(prevAvailableBalance > a.getAvailableBalance());
        assertTrue(prevTotalBalance > a.getTotalBalance());
        assertTrue(prevAvailableBalance - amount == a.getAvailableBalance());
        assertTrue(prevTotalBalance - amount == a.getTotalBalance());
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
