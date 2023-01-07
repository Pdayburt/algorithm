package com.anatkh.algorithm.sort;

public class SelectSort0107 {
    public static void main(String[] args) {
        int[] arr = {6,4,11,34,555,887,666,1111,43,1,0};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void selectSort(int[] arr) {
        if (arr ==null || arr.length <2) return;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = minValueIndex + 1; j < N; j++) minValueIndex = arr[minValueIndex] < arr[j]?minValueIndex:j;
            if (minValueIndex != i) swapArr(arr,minValueIndex,i);
        }

//        int arrLength = arr.length;
//        for (int i = 0; i < arrLength; i++) {
//            int minValueIndex = i;
//            for (int j = i+1; j < arrLength; j++) {
//                minValueIndex = arr[minValueIndex] < arr[j]?minValueIndex:j;
//            }
//            if (minValueIndex != i) {
//                swapArr(arr,i,minValueIndex);
//            }
//        }
    }

     static void swapArr(int[] arr, int i, int minValueIndex) {
        int temp = arr[i];
        arr[i] = arr[minValueIndex];
        arr[minValueIndex] = temp;
    }


}
