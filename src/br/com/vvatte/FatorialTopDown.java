package br.com.vvatte;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, n * fatorial(n - 1));
        }

        return memo.get(n);
    }

    public static void main(String[] args) {
        int n = 25;

        System.out.println("O fatorial de " + n + " é: " + fatorial(n));
    }
}
