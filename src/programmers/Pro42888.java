package programmers;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42888
public class Pro42888 {

    public static String[] solution(String[] record) {
        List<String> ansList = new ArrayList<String>();
        Map<String, String> userInfo = new HashMap<String, String>();
        for (String re : record) {
            String[] reArr = re.split(" ");
            if (reArr[0].equals("Enter") || reArr[0].equals("Change")) {
                userInfo.put(reArr[1], reArr[2]); // key: uid, value: name
            }
        }

        for (String re : record) {
            String[] reArr = re.split(" ");
            if (reArr[0].equals("Enter")) {
                ansList.add(userInfo.get(reArr[1]) + "님이 들어왔습니다.");
            }
            if (reArr[0].equals("Leave")) {
                ansList.add(userInfo.get(reArr[1]) + "님이 나갔습니다.");
            }
        }

        String[] answer = ansList.toArray(new String[ansList.size()]);
        return answer;
    }

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record))); // ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]
    }
}
