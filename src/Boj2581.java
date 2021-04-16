import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/1978
public class Boj2581 {
    static int M, N;
    static Scanner sc = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        M = sc.nextInt();
        N = sc.nextInt();
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) list.add(i);
        }

        int sum = 0;
        for (int el : list) {
            sum += el;
        }

        if (sum == 0) {
            System.out.println(-1);
        } else  {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
/*
60
100
->
620
61
 */