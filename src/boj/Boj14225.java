package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/14225
public class Boj14225 {

    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] S;
    static boolean[] visit;

    public static void dfs(int idx, int sum) {
        if (idx == N) {
            visit[sum] = true;
            return;
        }
        dfs(idx + 1, sum + S[idx]);
        dfs(idx + 1, sum);
    }

    public static void main(String[] args) {
        N = sc.nextInt();
        S = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
            sum += S[i];
        }
        visit = new boolean[sum + 2];
        dfs(0, 0);
        for (int i = 1; i < visit.length; i++) {
            if (!visit[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}