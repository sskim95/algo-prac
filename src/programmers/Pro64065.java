package programmers;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/64065
public class Pro64065 {
    public static int[] solution(String s) {
        String[] strs = s.replaceAll("[{}]", " ").trim().split(" , ");
        int[] answer = new int[strs.length];
        Arrays.sort(strs, (a, b) -> (a.length() - b.length()));
        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        for (String str : strs) {
            for (String st : str.split(",")) {
                int tmp = Integer.parseInt(st);
                if (hs.contains(tmp)) continue;
                hs.add(tmp);
                answer[i++] = tmp;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}"; // [2, 1, 3, 4]
        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}"; // [2, 1, 3, 4]
        String s3 = "{{20,111},{111}}"; // [111, 20]
        String s4 = "{{123}}"; // [123]
        String s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}"; // [3, 2, 4, 1]
        System.out.println(Arrays.toString(solution(s3)));
    }
}
