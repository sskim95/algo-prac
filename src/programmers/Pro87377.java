package programmers;

import java.util.*;

public class Pro87377 {

    public static String[] solution(int[][] line) {

        Set<List<Integer>> intersection = new HashSet<>();

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i < line.length - 1; i++) {
            for (int j = i + 1; j < line.length; j++) {
                long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];
                long denominator = a * d - b * c;
                if (denominator == 0) continue;

                long numerator1 = b * f - e * d;
                long numerator2 = e * c - a * f;
                if (numerator1 % denominator == 0 & numerator2 % denominator == 0) {
                    int intX = (int) (numerator1 / denominator);
                    int intY = (int) (numerator2 / denominator);
                    if (minX > intX) minX = intX;
                    if (maxX < intX) maxX = intX;
                    if (minY > intY) minY = intY;
                    if (maxY < intY) maxY = intY;
                    intersection.add(Arrays.asList(intX, intY));
                }
            }
        }
    
        List<String> stringList = new ArrayList<>();
        for (int i = minY; i <= maxY; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = minX; j <= maxX; j++) {
                sb.append(".");
            }
            stringList.add(sb.toString());
        }

        for (List<Integer> point : intersection) {
            StringBuilder sb = new StringBuilder(stringList.get(Math.abs(point.get(1) - maxY)));
            sb.setCharAt(Math.abs(point.get(0) - minX), '*');
            stringList.set(Math.abs(point.get(1) - maxY), sb.toString());
        }

        String[] answer = new String[stringList.size()];
        stringList.toArray(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[][] line1 = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        int[][] line2 = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        int[][] line3 = {{1, -1, 0}, {2, -1, 0}};
        int[][] line4 = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
        String[] solution = solution(line1);
        System.out.println(Arrays.toString(solution));
    }
}
