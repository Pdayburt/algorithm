package com.anatkh.algorithm.greenHand.orderedArray;

import com.anatkh.algorithm.greenHand.ArrGenerate;
import com.anatkh.algorithm.greenHand.ArrPrint;

import static com.anatkh.algorithm.greenHand.sort.BubbleSort0107.bubbleSort;

public class OALargerMostLeft0109 {
    /**
     * 有序数组中找到 >= num最左的位置
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = ArrGenerate.randomArr(20, 100);
        bubbleSort(ints);
        ArrPrint.myPrintArr(ints);
        System.out.println(findIndexWhereLargerMostLeft(ints, 45));

    }

    static int findIndexWhereLargerMostLeft(int[] arr,int num){
        int ans = -1;
        if (arr == null || arr.length <1) return ans;
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = (L +R)/2;
            if (arr[mid] >= num) {
                ans = mid;
                R = mid-1;
            }else {
                L = mid+1;
            }
        }
        return ans;
    }

}
