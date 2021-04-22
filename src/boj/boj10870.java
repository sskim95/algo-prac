package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10870
public class boj10870 {
    static int n;
    static int[] d = new int[21];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();
        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
    }
}
/*
10
-> 55
 */