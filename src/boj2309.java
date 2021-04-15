import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2309
public class boj2309 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] smalls = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            smalls[i] = sc.nextInt();
            sum += smalls[i];
        }
        Arrays.sort(smalls);
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - smalls[i] - smalls[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (i == k || j == k) continue;
                        System.out.println(smalls[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
/*
20
7
23
19
10
15
25
8
13
->
7
8
10
13
19
20
23
 */