package basic;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int temp;
        // 각 회전이 끝날 때마다 제외해야할 원소의 개수
        for (int i = 0; i < arr.length; i++) {
            // 원소 비교를 위한 인덱스를 뽑는 반복문
            for (int j = 1; j < arr.length - i; j++) {
                // 이전 원소가 현재 원소보다 크다면 서로 자리 교환
                if (arr[j - 1] > arr[j]) {
                    // swap(arr[j - 1], arr[j])
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                // System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 1, 3};
        bubbleSort(arr);
    }
}

/*
시간 복잡도: O(n^2)
공간 복잡도: O(n)
*/