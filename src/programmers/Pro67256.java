package programmers;

// https://programmers.co.kr/learn/courses/30/lessons/67256
public class Pro67256 {

    // 전 손가락 위치에서 현재 번호로 이동하는 횟수 구하기
    public static int getLength(int index, int number) {
        // 0은 11로 치환
        index = index == 0 ? 11 : index;
        number = number == 0 ? 11 : number;

        // 전 손가락 위치 좌표
        int x = (index - 1) / 3;
        int y = (index - 1) % 3;

        // 현재 번호 위치 좌표
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftIndex = 10; // * -> 10으로 치환
        int rightIndex = 12; // # -> 12로 치환
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                // Left
                sb.append("L");
                leftIndex = number;
            } else if (number == 3 || number == 6 || number == 9) {
                // Right
                sb.append("R");
                rightIndex = number;
            } else {
                // Center
                int leftLength = getLength(leftIndex, number);
                int rightLength = getLength(rightIndex, number);

                if (leftLength > rightLength) {
                    sb.append("R");
                    rightIndex = number;
                } else if (rightLength > leftLength) {
                    sb.append("L");
                    leftIndex = number;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftIndex = number;
                    } else {
                        sb.append("R");
                        rightIndex = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right"; // "LRLLLRLLRRL"
        System.out.println(solution(numbers, hand));
    }
}
