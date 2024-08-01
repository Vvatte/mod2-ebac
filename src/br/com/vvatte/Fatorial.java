package br.com.vvatte;

public class Fatorial {

    public static long findElement(long n){
        long resultado = 1;
        for (long i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args){
        long n = 20;

        System.out.println("Fatorial de " + n + " é igual: " + findElement(n));
    }
}

