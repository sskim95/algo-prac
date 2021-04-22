package boj;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/14888
public class Boj14888 {

    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void dfs(int num, int idx) {
        if (idx == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0:
                        dfs(num + numbers[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - numbers[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * numbers[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / numbers[idx], idx + 1);
                        break;
                }
                operators[i]++;
            }
        }
    }

    public static void main(String[] args) {
        N = sc.nextInt();
        numbers = new int[N];

        // 숫자 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // 연산자 입력
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        dfs(numbers[0], 1);

        System.out.println(Arrays.toString(operators));
        System.out.println(max);
        System.out.println(min);
    }
}
/*
2
5 6
0 0 1 0
->
30
30
*/