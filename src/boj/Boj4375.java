package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while (true) {
            input = br.readLine();
            if (input == null || input.isEmpty()) break;
            int n = Integer.parseInt(input);
            long num = 1;
            int size = 1;
            while (true) {
                // 만약에 1로만 이루어진 숫자가 n으로 나누어 떨어진다면 break
                if (num % n == 0) break;
                // 아닐 경우 num에 1 추가 ex) 11 -> 111
                // num = (10 * num) + 1; // 시간 초과

                // 결국 n의 배수인 num을 찾는 것이기 때문에 num / n의 나머지 이용 (나머지 정)
                num = ((10 * num) + 1) % n;
                size++;
            }
            System.out.println(size);
        }
    }
}