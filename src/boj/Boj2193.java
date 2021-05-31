package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2193
public class Boj2193 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n + 1][2];

        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + dp[i - 1][1];
                } else {
                    dp[i][j] = dp[i - 1][0];
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += dp[n][i];
        }

        System.out.println(sum);
    }
}
