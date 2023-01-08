package com.anatkh.algorithm.greenHand.sort;

public class BubbleSort0107 {

    public static void main(String[] args) {
        int[] arr = {33,2,44,1,999,7,6,33,24,65,5687,87,78};
        SelectSort0107.printArr(arr);
        bubbleSort(arr);
        SelectSort0107.printArr(arr);
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <2) return;
        int N = arr.length;
        for (int n = N-1; n >= 0; n--) {
            for (int i = 1; i <= n; i++) {
                if (arr[i-1]>arr[i]) SelectSort0107.swapArr(arr,i,i-1);
            }
        }
//        int arrLength = arr.length;
//        for (int i = arrLength-1; i >= 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                if (arr[j-1] > arr[j]){
//                    swapArr(arr,j-1,j);
//                }
//            }
//        }
    }



}
