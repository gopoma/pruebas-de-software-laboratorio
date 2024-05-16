package com.episunsa.demoTesting;

import java.util.ArrayList;

public class Fibonacci {
    private static boolean inicializado = false;
    private static ArrayList<Long> precalculado;

    public static int VALOR_INVALIDO = -45;

    public static void inicializar() {
        precalculado = new ArrayList<Long>();
        
        precalculado.add((long) 0);
        precalculado.add((long) 1);
    }

    public static long calcular(int n) {
        if(!inicializado) {
            inicializar();

            inicializado = true;
        }

        if(n < 0) return VALOR_INVALIDO;

        while(precalculado.size() <= n) {
            long ultimo = precalculado.get(precalculado.size() - 1);
            long penultimo = precalculado.get(precalculado.size() - 2);

            precalculado.add(ultimo + penultimo);
        }

        return precalculado.get(n);
    }
}
