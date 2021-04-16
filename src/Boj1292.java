import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1978
public class Boj1292 {
    static int A, B;
    static Scanner sc = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();

    public static void createList() {
        int n = 1;
        while (list.size() <= 1000) {
            for (int i = 0; i < n; i++) {
                list.add(n);
            }
            n++;
        }
    }

    public static void main(String[] args) {
        A = sc.nextInt();
        B = sc.nextInt();
        createList();
        int sum = 0;
        for (int i = A - 1; i < B; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
/*
3 7
-> 15
 */