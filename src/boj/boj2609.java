package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2609
public class boj2609 {

    static Scanner sc = new Scanner(System.in);

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
/*
24 18
->
6
72
 */