package com.anatkh.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestSort {

    @Test
    void testMySort(){
        int[] arr = comp(10, 10000);
        /**
         * 选择排序
         */
//        myPrintArr(arr);
//        mySelectSort(arr);
//        myPrintArr(arr);
        /**
         * 冒泡排序
         */
//        myPrintArr(arr);
//        myBubbleSort(arr);
//        myPrintArr(arr);
        /**
         * 插入排序
         */
        myPrintArr(arr);
        myInsertSort(arr);
        myPrintArr(arr);

    }

    private void myInsertSort(int[] arr) {
        if (arr == null || arr.length <2) return;
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int newValueIndex = i;
            for (int valueIndex = newValueIndex; valueIndex > 0; valueIndex--) {
                if (arr[valueIndex] < arr[valueIndex-1]) mySwapArr(arr,newValueIndex,newValueIndex-1);
            }
        }
    }

    private void myBubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int length = arr.length;
        for (int i = length; i >= 0; i--) {
            for (int j = 0; j < length-1; j++) {
                if (arr[j] > arr[j+1]) mySwapArr(arr,j,j+1);
            }
        }
    }

    private void mySelectSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int minValueIndex = i;
            for (int j = minValueIndex+1; j < length; j++) {
                if (arr[minValueIndex] > arr[j]) mySwapArr(arr,minValueIndex,j);
            }
        }

    }

    private void mySwapArr(int[] arr, int minValueIndex, int j) {
        int temp = arr[minValueIndex];
        arr[minValueIndex] = arr[j];
        arr[j] = temp;
    }


    private void myPrintArr(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int[] comp(int maxLength,int maxValue){
        int length = (int) (Math.random() * maxLength);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random()*maxValue);
        }
        return arr;
    }

}
