package boj;

import java.util.Scanner;

// https://www.acmicpc.net/problem/6603
public class Boj6603 {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static String[] line;
    static boolean[] visit;

    public static void dfs(int start, int depth) {
        if (depth == 6) {
            String str = "";
            for (int i = 1; i <= n; i++) {
                if (visit[i]) str += line[i] + " ";
            }
            System.out.println(str);
        }
        for (int i = start; i <= n; i++) {
            visit[i] = true;
            dfs(i + 1, depth + 1);
            visit[i] = false;
        }
    }

    public static void main(String[] args) {
        while (true) {
            line = sc.nextLine().split(" ");
            n = Integer.parseInt(line[0]);
            visit = new boolean[n + 1];
            if (n == 0) break;
            dfs(1, 0);
            System.out.println();
        }
    }
}
/*
7 1 2 3 4 5 6 7
0
 */