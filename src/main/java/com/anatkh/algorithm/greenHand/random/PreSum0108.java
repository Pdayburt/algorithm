package com.anatkh.algorithm.greenHand.random;

public class PreSum0108 {

    public static class PreSum{
        public int[] preSum;
        public PreSum(int[] arr){
            int N = arr.length;
            preSum=new int[N];
            preSum[0] = arr[0];
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i-1]+arr[i];
            }
        }
    }
}
