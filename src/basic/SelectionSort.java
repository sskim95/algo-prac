package basic;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int temp, indexMin;
        // 오름차순으로 정렬하기 위한 인덱스 선택
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            // 반복문을 돌면서 위치에 들어갈 제일 작은 수 찾기
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            // swap(arr[indexMin], arr[i])
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
            // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 1, 3};
        selectionSort(arr);
    }
}

/*
시간 복잡도: O(n^2)
공간 복잡도: O(n)
*/