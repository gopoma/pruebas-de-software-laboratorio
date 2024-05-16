package com.episunsa.demoTesting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void deberiaDarValoresAcordeALaListaFibonacci() {
        assertTrue(Fibonacci.calcular(-1) == Fibonacci.VALOR_INVALIDO);
        assertTrue(Fibonacci.calcular(-100) == Fibonacci.VALOR_INVALIDO);

        assertTrue(Fibonacci.calcular(0) == 0);
        assertTrue(Fibonacci.calcular(1) == 1);
        assertTrue(Fibonacci.calcular(2) == 1);
        assertTrue(Fibonacci.calcular(3) == 2);
        assertTrue(Fibonacci.calcular(4) == 3);
        assertTrue(Fibonacci.calcular(5) == 5);

        assertTrue(Fibonacci.calcular(10) == 55);

        assertTrue(Fibonacci.calcular(0) == 0);
        assertTrue(Fibonacci.calcular(1) == 1);
        assertTrue(Fibonacci.calcular(2) == 1);
        assertTrue(Fibonacci.calcular(3) == 2);
        assertTrue(Fibonacci.calcular(4) == 3);
        assertTrue(Fibonacci.calcular(5) == 5);
    }
}
