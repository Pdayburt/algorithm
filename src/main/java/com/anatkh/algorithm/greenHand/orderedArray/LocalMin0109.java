package com.anatkh.algorithm.greenHand.orderedArray;

import com.anatkh.algorithm.greenHand.ArrGenerate;
import com.anatkh.algorithm.greenHand.ArrPrint;

public class LocalMin0109 {
    /**
     * 数组 无序 任意相邻两个数不相等
     * 寻找到局部最小值的下标，找到一个就行
     */
    public static void main(String[] args) {
        int[] ints = ArrGenerate.localMinArr(10, 100);
        ArrPrint.myPrintArr(ints);
        int localMinValueIndex = findLocalMinValueIndex(ints);
        System.out.println(localMinValueIndex);
    }

    private static int findLocalMinValueIndex(int[] arr) {
        int length = arr.length;
        if (arr == null || arr.length < 1) return -1;
        if (arr.length == 1) return 0;
        if (arr[0] < arr[1]) return 0;
        if (arr[length - 2] > arr[length - 1]) return length - 1;
        int L = 0, R = length - 1;
        while (L < R - 1) {
            int mid = (L+R)/2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid+1]){
                /**
                 *   mid-1>mind<mid+1
                 */
                return mid;
            }else {
                /**
                 * mid-1>mind>mid+1
                 * mid-1<mind<mid+1
                 * mid-1<mind>mid+1
                 */
                if(arr[mid] > arr[mid-1]){
                    R = mid -1;
                }else {
                    L = mid+1;
                }
            }
        }
        return arr[L]>arr[R]?R:L;
    }


}
