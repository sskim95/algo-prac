import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2693
public class boj2693 {

    static int T;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int[] nums = new int[10];
            for (int j = 0; j < 10; j++) {
                nums[j] = sc.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(nums[7]);
        }
    }
}
/*
4
1 2 3 4 5 6 7 8 9 1000
338 304 619 95 343 496 489 116 98 127
931 240 986 894 826 640 965 833 136 138
940 955 364 188 133 254 501 122 768 408
->
8
489
931
768
 */