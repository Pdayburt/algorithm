package com.anatkh.algorithm.greenHand.orderedArray;

import com.anatkh.algorithm.greenHand.ArrGenerate;

import static com.anatkh.algorithm.greenHand.sort.BubbleSort0107.bubbleSort;
import static com.anatkh.algorithm.greenHand.sort.SelectSort0107.printArr;

public class OAExist0109 {
    /**
     * 二分法找数，前提是有序。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = ArrGenerate.randomArr(10, 10);
        bubbleSort(ints);
        printArr(ints);
        boolean isExist = findIsExist(ints, 5);
        System.out.println(isExist);
    }

    static boolean findIsExist(int[] arr, int num) {
        if (arr == null || arr.length < 1) return false;
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) return true;
            else if (arr[mid] < num) L = mid + 1;
            else R = mid - 1;
        }
        return false;
    }
}
