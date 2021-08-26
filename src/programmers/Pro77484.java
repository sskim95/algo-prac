package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/77484
public class Pro77484 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matchCnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) zeroCnt++;
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    matchCnt++;
                    break;
                }
            }
        }
        
        return new int[]{getRank(zeroCnt + matchCnt), getRank(matchCnt)};
    }

    public static int getRank(int num) {
        if (num == 6) return 1;
        if (num == 5) return 2;
        if (num == 4) return 3;
        if (num == 3) return 4;
        if (num == 2) return 5;
        else return 6;
    }

    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(solution(lottos1, win_nums1))); // [3, 5]
        System.out.println(Arrays.toString(solution(lottos2, win_nums2))); // [1, 6]
        System.out.println(Arrays.toString(solution(lottos3, win_nums3))); // [1, 1]
    }
}
