package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10430
public class Boj10430 {

    public static Scanner sc = new Scanner(System.in);
    public static int A, B, C;

    public static void main(String[] args) {
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int first = (A + B) % C;
        int second = ((A % C) + (B % C)) % C;
        int third = (A * B) % C;
        int fourth = ((A % C) * (B % C)) % C;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
