package programmers;

import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/84325
public class Pro84325 {

    public static void main(String[] args) {
        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"PYTHON", "C++", "SQL"};
        int[] preference = {7, 5, 5};
        System.out.println(solution(table, languages, preference)); // "HARDWARE"
    }

    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int tmp = 0;
        for (String row : table) {
            String[] rowArr = row.split(" ");
            String rowName = rowArr[0];
            int sum = 0;
            for (int i = 0; i < languages.length; i++) {
                for (int j = 1; j < rowArr.length; j++) {
                    if (languages[i].equals(rowArr[j])) {
                        sum += preference[i] * (6 - j);
                    }
                }
            }
            if (sum > tmp) {
                answer = rowName;
                tmp = sum;
            }
            if (sum == tmp) {
                String[] tmpArr = {answer, rowName};
                Arrays.sort(tmpArr);
                answer = tmpArr[0];
            }
        }

        return answer;
    }
}
