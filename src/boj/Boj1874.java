package boj;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/1874
public class Boj1874 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt(); // 입력 받을 숫자 갯 수 
        Stack<Integer> stack = new Stack<>();

        int start = 0;
        for (int i = 0; i < n; i++) {
            int target = sc.nextInt(); // 입력 받은 숫자
            // 입력 받은 숫자까지 stack에 push
            if (target > start) {
                for (int j = start + 1; j <= target; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = target; // 다음 push를 위해 start = target으로 초기화
            }

            // 만약 stack top이 target과 같지 않다면 실행 종료
            if (stack.peek() != target) {
                System.out.println("NO");
                System.exit(0);
            }

            // stack top과 target이 같으면 pop
            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);
    }
}
