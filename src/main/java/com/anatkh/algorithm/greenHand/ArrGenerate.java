package com.anatkh.algorithm.greenHand;

public class ArrGenerate {
    public static int[] randomArr(int maxLength,int maxValue){
        int length = (int) (Math.random() * maxLength);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random()*maxValue);
        }
        return arr;
    }

    /**
     * 数组 无序 任意相邻两个数不相等
     * @param maxLength
     * @param maxValue
     * @return
     */
    public static int[] localMinArr(int maxLength,int maxValue){
        int length = (int) (Math.random() * maxLength);
        int[] ints = new int[length];
        if (length > 0){
            ints[0] = (int) (Math.random()*maxValue);
            for (int i = 1; i < length; i++) {
                int value = (int) (Math.random() * maxValue);
                if (ints[i-1] != value) ints[i] = value;
            }
        }
        return ints;
    }
}

