package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/14719
public class Boj14719 {

    static int H, W;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        H = sc.nextInt();
        W = sc.nextInt();
        int[] blocks = new int[W];

        for (int i = 0; i < W; i++) {
            blocks[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 1; i < W - 1; i++) {
            int left = 0, right = 0;
            for (int j = i - 1; j >= 0 ; j--) {
                left = Math.max(left, blocks[j]);
            }
            for (int j = i + 1; j < W; j++) {
                right = Math.max(right, blocks[j]);
            }
            int tmp = Math.min(left, right) - blocks[i];
            if (tmp >= 0) result += tmp;
        }
        System.out.println(result);
    }
}
/*
4 4
3 0 1 4
-> 5
 */