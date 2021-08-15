package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2884
public class Boj2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        if (min < 45) {
            int restMin = 45 - min;
            min = 60 - restMin;
            hour--;
            if (hour < 0) {
                hour = 23;
            }
        } else {
            min -= 45;
        }

        System.out.println(hour + " " + min);
    }
}
