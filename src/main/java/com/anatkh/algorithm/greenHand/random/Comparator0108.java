package com.anatkh.algorithm.greenHand.random;


public class Comparator0108 {
    public static void main(String[] args) {
        int[] ints = randomLengthRandomValue(10, 100);

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
