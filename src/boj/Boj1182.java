package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1182
public class Boj1182 {

    static Scanner sc = new Scanner(System.in);
    static int N, S, count = 0;
    static int[] arr;

    public static void dfs(int idx, int sum) {
        if (idx == N) {
            if (sum == S) count++;
            return;
        }
        dfs(idx + 1, sum + arr[idx]);
        dfs(idx + 1, sum);
    }

    public static void main(String[] args) {
        N = sc.nextInt();
        S = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0, 0);
        System.out.println(S == 0 ? --count : count);
    }
}