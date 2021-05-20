package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj3085 {

    public static int N;
    public static char[][] board;
    public static int ans = 0;

    public static void countCandy() {
        // 오른쪽 뱡향으로 확인
        for (int i = 0; i < N; i++) {
            int count1 = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    count1++;
                } else {
                    count1 = 1;
                }
                ans = Math.max(ans, count1);
            }
        }

        // 아래 방향으로 확인
        for (int i = 0; i < N; i++) {
            int count2 = 1;
            for (int j = 0; j < N - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    count2++;
                } else {
                    count2 = 1;
                }
                ans = Math.max(ans, count2);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];

        // N * N 사탕 입력 받기
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        // 가로로 두 사탕 교환하고 최대 사탕 수 찾은 후 원위치
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                // 가로로 인접한 두 문자 교환
                char temp = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = temp;

                // 오른쪽, 아래 방향으로 확인
                countCandy();

                // 교환 했던 문자 복구
                temp = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = temp;
            }
        }

        // 세로로 두 사탕 교환하고 최대 사탕 수 찾은 후 원위치
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                // 세로로 인접한 두 문자 교환
                char temp = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = temp;

                // 오른쪽, 아래 방향으로 체크
                countCandy();

                // 교환 했던 문자 복구
                temp = board[j][i];
                board[j][i] = board[j + 1][i];
                board[j + 1][i] = temp;
            }
        }
        System.out.println(ans);
    }
}

//            String tmp = br.readLine();
//            for (int j = 0; j < N; j++) {
//                board[i][j] = tmp.charAt(j);
//            }