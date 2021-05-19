package boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] smalls = new int[9]; // 9명의 키를 저장하기 위한 배열
        int sum = 0; // 9명 키의 총 합을 위한 변수

        // 배열과 합 입력 받기
        for (int i = 0; i < 9; i++) {
            smalls[i] = sc.nextInt();
            sum += smalls[i];
        }

        // 오름차순 출력을 위한 정렬
        Arrays.sort(smalls);

        // 중첩 루프를 활용하여 총 합에서 2명의 키를 뺀 값이 100일 때를 확인
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - smalls[i] - smalls[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        // 2명을 제외하고 나머지 7명만 출력
                        if (k == i || k == j) continue;
                        System.out.println(smalls[k]);
                    }
                }
            }
        }
    }
}