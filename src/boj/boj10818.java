package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10818
public class boj10818 {
    static int N, min, max;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        N = sc.nextInt();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (tmp < min) min = tmp;
            if (tmp > max) max = tmp;
        }
        System.out.println(min + " " + max);
    }
}
/*
5
20 10 35 30 7
-> 7 35
 */