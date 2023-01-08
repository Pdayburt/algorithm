package com.anatkh.algorithm.greenHand.random;


import static com.anatkh.algorithm.greenHand.sort.BubbleSort0107.bubbleSort;

public class Comparator0108 {
    public static void main(String[] args) {
        int[] ints = randomLengthRandomValue(10, 100);
        bubbleSort(ints);

    }


    static boolean isSorted(int[] arr){

        return true;
    }

    static int[] randomLengthRandomValue(int maxLength,int maxValue){
        int length = (int) (Math.random() * maxLength);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }
}
