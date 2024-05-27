package com.episunsa.demoTesting;

public class FibonacciGemini {
    /**
     * Calcula el n-ésimo número de Fibonacci utilizando recursión.
     *
     * @param n El índice del número de Fibonacci que se desea calcular.
     * @return El n-ésimo número de Fibonacci.
     */
    public static long calcularNumeroFibonacci(int n) throws Exception {
        if (n < 0) throw new IllegalArgumentException("n no puede ser negativo!");
        if (n == 0 || n == 1) {
            return n;
        } else {
            return calcularNumeroFibonacci(n - 1) + calcularNumeroFibonacci(n - 2);
        }
    }
}
