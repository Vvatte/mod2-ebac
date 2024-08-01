package br.com.vvatte;

public class FatorialRecursivo {

    public static long buscarElemento(long n){
        if (n == 0){
            return 1;
        }else {
            return n * buscarElemento( n - 1);
        }
    }

    public static void main(String[] args){
        int n = 50;

        System.out.println("Fatorial de " + n + " é igual: " + buscarElemento(n));
    }
}
