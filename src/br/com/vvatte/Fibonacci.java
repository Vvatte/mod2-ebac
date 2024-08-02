package br.com.vvatte;

public class Fibonacci {

    private static final int MAX_ELEMENT = 100;

    private static final long[] elements = new long[MAX_ELEMENT];

    public static long encontrarElementoPD(int n){ //
        for(int i = 0; i < MAX_ELEMENT; i++ ){
            elements[i] = -1;
        }

        return encontrarElemento(n);
    }

    public static long encontrarElemento(int n){
        if (elements[n] == -1){
            if(n <= 1){
                elements[n] = n;
            } else {
                elements[n] = encontrarElemento(n - 1) + encontrarElemento(n - 2);
            }
        }
            return elements[n];
    }

    // O(n)  A programação dinamica é melhor pois a ideia é armazenar os resultados intermediários
    // em um array para evitar recalcular os mesmos valores repetidamente.
    public static void main(String[] args){
        int n = 8;

        System.out.println("elemento " + n + " resultado: " + encontrarElementoPD(n));
    }
}
