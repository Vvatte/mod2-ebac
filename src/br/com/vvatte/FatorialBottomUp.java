package br.com.vvatte;

import java.math.BigInteger;

public class FatorialBottomUp {

    public static long fatorial(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = i * dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 40;

        System.out.println("O fatorial de " + n + " é: " + fatorial(n));
    }
}
