import java.util.Scanner;

// https://www.acmicpc.net/problem/3460
public class boj3460 {
    static int T, n;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            String str = Integer.toBinaryString(n);
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(j) == '1') {
                    System.out.print(str.length() - 1 - j + " ");
                }
            }
        }
    }

    public static String toBinaryStr(int n) {
        String str = "";
        while (n > 0) {
            int r = n % 2;
            str = r + str;
            n /= 2;
        }
        return str;
    }
}
/*
1
13
-> 0 2 3
 */