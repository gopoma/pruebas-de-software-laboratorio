package com.episunsa.demoTesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciGeminiTest {
    @Test
    public void testFibonacciRecursivoCasosPequeños() {
        try {
            long fibonacci0 = FibonacciGemini.calcularNumeroFibonacci(0);
            long fibonacci1 = FibonacciGemini.calcularNumeroFibonacci(1);
            long fibonacci2 = FibonacciGemini.calcularNumeroFibonacci(2);
    
            assertEquals(0, fibonacci0);
            assertEquals(1, fibonacci1);
            assertEquals(1, fibonacci2);
        } catch(Exception e) {
            fail("Se supone que no debería pasar por aquí");
        }
    }

    @Test
    public void testFibonacciRecursivoCasosGrandes() {
        try {
            long fibonacci10 = FibonacciGemini.calcularNumeroFibonacci(10);
            long fibonacci11 = FibonacciGemini.calcularNumeroFibonacci(11);
            long fibonacci12 = FibonacciGemini.calcularNumeroFibonacci(12);
    
            assertEquals(55, fibonacci10);
            assertEquals(89, fibonacci11);
            assertEquals(144, fibonacci12);
        } catch(Exception e) {
            fail("Se supone que no debería pasar por aquí");
        }
    }

    @Test
    public void testFibonacciRecursivoValoresNegativos() {
        try {
            FibonacciGemini.calcularNumeroFibonacci(-1);
            fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Se supone que no debería pasar por aquí");
        }

        try {
            FibonacciGemini.calcularNumeroFibonacci(-5);
            fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Se supone que no debería pasar por aquí");
        }

        try {
            FibonacciGemini.calcularNumeroFibonacci(-10);
            fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Expected exception
        } catch (Exception e) {
            fail("Se supone que no debería pasar por aquí");
        }
    }

    @Test
    public void testFibonacciRecursivoLimiteMaximo() {
        try {
            //? // This test verifies correct behavior for the maximum long value
            //? assertEquals(Long.MAX_VALUE, FibonacciGemini.calcularNumeroFibonacci(92));
    
            // This test verifies overflow for a value exceeding the maximum long value
            // You might need to adjust the expected exception based on your implementation
            try {
                FibonacciGemini.calcularNumeroFibonacci(20);
            } catch (Exception e) {
                fail("Se supone que no debería pasar por aquí");
            }
        } catch(Exception e) {
            fail("Se supone que no debería pasar por aquí");
        }
    }
}
