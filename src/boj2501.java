import java.util.Scanner;

public class boj2501 {
// https://www.acmicpc.net/problem/2501
}

class Main {
    static int N, K;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        N = sc.nextInt();
        K = sc.nextInt();
        System.out.println(solution());
    }

    public static int solution() {
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) K--;
            if (K == 0) return i;
        }
        return 0;
    }
}