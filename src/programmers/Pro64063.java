package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://programmers.co.kr/learn/courses/30/lessons/64063
public class Pro64063 {

    public static Map<Long, Long> map = new HashMap<>();

    public static long findEmptyRoom(long room) {
        if (!map.containsKey(room)) {
            map.put(room, room + 1);
            return room;
        }
        long nextRoom = map.get(room);
        long emptyRoom = findEmptyRoom(nextRoom);
        map.put(room, emptyRoom);
        return emptyRoom;
    }

    public static long[] solution(long k, long[] room_number) {
        int n = room_number.length;
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            ans[i] = findEmptyRoom(room_number[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        long k = 10;
        long[] room_number = {1,3,4,1,3,1};
        // [1,3,4,2,5,6]
        System.out.println(Arrays.toString(solution(k, room_number)));
    }
}
