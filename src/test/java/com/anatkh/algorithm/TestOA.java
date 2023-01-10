package com.anatkh.algorithm;

import com.anatkh.algorithm.greenHand.ArrGenerate;
import com.anatkh.algorithm.greenHand.ArrPrint;
import com.anatkh.algorithm.greenHand.ArrSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestOA {
    /**
     * 二分法找数，前提是有序。
     */

    @Test
    void testFindNumByBinary() {
        int[] arr = ArrGenerate.randomArr(20, 10);
        ArrSort.bubbleSort(arr);
        ArrPrint.myPrintArr(arr);
        int res = findNumByBinary(arr, 5);
        System.out.println(res);
    }

    private int findNumByBinary(int[] arr, int num) {
        int length = arr.length;
        if (arr == null || length < 1) return -1;
        int index = -1;
        int L = 0;
        int R = length - 1;
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr[mid] == num) return mid;
            else if (arr[mid] < num) L = mid + 1;
            else R = mid - 1;
        }
        return index;
    }


    /**
     * 有序数组中找到 >= num最左的位置
     */
    @Test
    void testFindLargeMostLeft() {
        int[] arr = ArrGenerate.randomArr(20, 10);
        ArrSort.insertSort(arr);
        ArrPrint.myPrintArr(arr);
        int largeMostLeft = findLargeMostLeft(arr, 5);
        System.out.println(largeMostLeft);
    }

    private int findLargeMostLeft(int[] arr, int num) {
        if (arr == null || arr.length < 1) return -1;
        int length = arr.length;
        int L = 0;
        int R = length - 1;
        int index = -1;
        while (L < R){
            int mid = (L+R)/2;
            if (arr[mid] >= num) {
                R = mid-1 ;
                index = mid;
            }
            else L = mid+1;
        }
        return index;

    }

    /**
     * 练习====+=====
     * 有序数组中找到 <= num最右的位置
     * @param
     */
    @Test
    void testFindLessMostRight(){
        int[] arr = ArrGenerate.randomArr(20, 10);
        ArrSort.selectSort(arr);
        ArrPrint.myPrintArr(arr);
        int lessMostRight = findLessMostRight(arr, 5);
        System.out.println(lessMostRight);
    }

    private int findLessMostRight(int[] arr, int num) {
        if (arr == null || arr.length < 1) return -1;
        int length = arr.length;
        int L = 0;
        int R = length -1;
        int index = -1;
        while (L <= R) {
            int mid = (L+R)/2;
            if (arr[mid] <= num) {
                L = mid+1 ;
                index = mid;
            }
            else R = mid-1;
        }
        return index;
    }


    /**
     * 数组 无序 任意相邻两个数不相等
     * 寻找到局部最小值的下标，找到一个就行
     */
    @Test
    void testFindLocalMin(){
        int[] arr = ArrGenerate.localMinArr(20, 10);
        ArrPrint.myPrintArr(arr);
        int localMin = findLocalMin(arr);
        System.out.println(localMin);
    }

    private int findLocalMin(int[] arr) {
        if (arr == null || arr.length <1) return -1;
        int length = arr.length;
        if (length == 1) return 0;
        if (arr[0] < arr[1]) return 0;
        if (arr[length-2]> arr[length-1]) return length-1;
        int index = -1;
        int L = 0;
        int R = length - 1;
        while ( L < R -1){
            int mid = (L+R)/2;
            /**
             *  >  <
             */
            if (arr[mid] < arr[mid-1] && arr[mid] <arr[mid+1]) return mid;
            else {
                /**
                 *    > >
                 *    < >
                 *    < <
                 */
                if (arr[mid] > arr[mid -1]){
                    R = mid-1;
                }else {
                    L = mid+1;
                }
            }
        }
        return index;
    }


}
