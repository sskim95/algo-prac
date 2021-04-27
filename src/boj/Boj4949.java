package boj;

import java.util.Scanner;
import java.util.Stack;

// https://www.acmicpc.net/problem/4949
public class Boj4949 {

    public static String solve(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 왼쪽 괄호 일 때 stack에 push
            if (ch == '(' || ch =='[') {
                stack.push(ch);
            }
            // 오른쪽 소괄호 판별
            if (ch == ')') { // 만약 스택이 비어있거나 스택 top이 '('이 아닐 경우 -> no
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
            // 오른쪽 대괄호 판별
            if (ch == ']') { // 만약 스택이 비어있거나 스택 top이 '['이 아닐 경우 -> no
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        // for loop을 다 돌린 후 stack이 empty면 yes 아니면 no
        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals(".")) break; // 종료조건
            System.out.println(solve(str));
        }
    }
}
