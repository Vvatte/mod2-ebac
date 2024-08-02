package br.com.vvatte;

public class FibonacciRecursivo {

    public static int findElement(int n){ // O(2^n) Pois a função chama a si mesma duas vezes para calcular os valores anteriores da sequência.
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
