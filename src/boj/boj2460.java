package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2460
public class boj2460 {

    static int exit, enter;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0, max = 0;
        for (int i = 0; i < 10; i++) {
            exit = sc.nextInt();
            total -= exit;
            enter = sc.nextInt();
            total += enter;
            if (total > max) max = total;
        }
        System.out.println(max);
    }
}
/*
0 32
3 13
28 25
17 5
21 20
11 0
12 12
4 2
0 8
21 0
-> 42
 */