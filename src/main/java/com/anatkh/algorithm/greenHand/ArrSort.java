package com.anatkh.algorithm.greenHand;

import static com.anatkh.algorithm.greenHand.sort.SelectSort0107.swapArr;

public class ArrSort {
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int N = arr.length;
        for (int n = N - 1; n >= 0; n--) {
            for (int i = 1; i <= n; i++) {
                if (arr[i - 1] > arr[i]) swapArr(arr, i, i - 1);
            }
        }
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swapArr(arr, pre, pre + 1);
            }
        }
    }

    public static void selectSort(int[] arr) {
        if (arr ==null || arr.length <2) return;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = minValueIndex + 1; j < N; j++) minValueIndex = arr[minValueIndex] < arr[j]?minValueIndex:j;
            if (minValueIndex != i) swapArr(arr,minValueIndex,i);
        }
    }
}
