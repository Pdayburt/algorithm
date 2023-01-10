package com.anatkh.algorithm.greenHand.sort;

public class InsertSort0107 {
    public static void main(String[] args) {
        int[] arr = {6, 4, 11, 34, 555, 887, 666, 1111, 43, 1, 0};
        SelectSort0107.printArr(arr);
        insertSortSecond(arr);
        SelectSort0107.printArr(arr);
    }

    private static void insertSortSecond(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                SelectSort0107.swapArr(arr, pre, pre + 1);
            }
        }
    }

    private static void insertSortFirst(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newNumIndex = end;
            while (newNumIndex - 1 >= 0 && arr[newNumIndex] < arr[newNumIndex - 1]) {
                SelectSort0107.swapArr(arr, newNumIndex, newNumIndex - 1);
                newNumIndex--;
            }
        }

    }


}
