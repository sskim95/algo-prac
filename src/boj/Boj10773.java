package boj;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/10773
public class Boj10773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) { // 0 -> 최근 숫자 제거
                stack.pop();
            } else { // 0 이외의 숫자 -> stack에 삽입
                stack.push(tmp);
            }
        }
        int sum = 0;
        for (Integer integer : stack) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
