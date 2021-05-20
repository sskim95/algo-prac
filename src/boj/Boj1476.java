package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 공백을 기준으로 나누어서 문자열 배열에 저장
        String[] tmp = br.readLine().split(" ");
        int E = Integer.parseInt(tmp[0]);
        int S = Integer.parseInt(tmp[1]);
        int M = Integer.parseInt(tmp[2]);

        int year = 1;
        while (true) {
            // 주어진 조건에 만족할 때까지 year 1씩 증가
            if ((year - E) % 15 == 0 && (year - S) % 28 == 0 && (year - M) % 19 == 0) break;
            year++;
        }
        System.out.println(year);

//        int ee = 1, ss = 1, mm = 1, year = 1;
//        while (true) {
//            // 만약 각 값이 결과값과 같다면 루프 종료
//            if (ee == E && ss == S & mm == M) break;
//            // 1년마다 1씩 증가
//            ee++;
//            ss++;
//            mm++;
//            year++;
//            // 범위를 초과하면 1로 초기화
//            if (ee > 15) ee = 1;
//            if (ss > 28) ss = 1;
//            if (mm > 19) mm = 1;
//        }
//        System.out.println(year);

    }
}
