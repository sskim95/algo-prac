package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1978
public class Boj1978 {
    static int N;
    static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (isPrime(a)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
4
1 3 5 7
-> 3
 */