package br.com.vvatte;

public class FibonacciRecursivo {

    public static int findElement(int n){ // O(
        if (n <= 1){
            return 1;
        }
        return findElement(n -1) + findElement(n -2);
    }

    public static void main(String[] args){
        int n = 7;

        System.out.print("Resultado de " + n + " é: " + findElement(n));
    }
}
