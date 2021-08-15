package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10798
public class Boj10798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] list = new String[5][];

        for (int i = 0; i < 5; i++) {
            list[i] = br.readLine().split("");
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (list[i].length <= j) continue;
                sb.append(list[i][j]);
            }
        }

        System.out.println(sb);
    }

}
