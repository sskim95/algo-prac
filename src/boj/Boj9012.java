package boj;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/9012
public class Boj9012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); // 테스트 데이터 갯 수

        for (int i = 0; i < T; i++) {
            String[] str = sc.nextLine().split("");
            Stack<String> stack = new Stack<>();
            String tmp = ""; // for loop이 안 끝난 시점에서 더 이상 stack에서 pop이 안 될 때 대비용 문자열
            for (String s : str) {
                if (s.equals("(")) {
                    stack.push(")");
                } else {
                    if (stack.isEmpty()) {
                        tmp = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (!stack.isEmpty() || tmp.equals("NO")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
