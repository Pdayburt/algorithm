package com.anatkh.algorithm.greenHand.random;

public class MathRandom0108 {
    public static void main(String[] args) {

        /** [0,1)
        *   double random = Math.random();
         *   [0,k-1] /[0,k)
         *   double random = Math.random()*K
         *
        */
        int count =0;
//        for (int i = 0; i < 10000; i++) {
//          if (Math.random() < 0.65) count++;
//        }
//        System.out.println((double) count / (double) 10000);

        int testTimes = 1000000;
//        int k = 9;
//        int[] counts = new int[k];
//        for (int i = 0; i < 1000000; i++) {
//            int v = (int)(Math.random() * k);
//            counts[v]++;
//        }
//        for (int i = 0; i < counts.length; i++) {
//            System.out.println(counts[i]);
//        }

        for (int i = 0; i < testTimes; i++) {
            if (xTpPower2() < 0.5) {
                count++;
            }
        }
        System.out.println((double) count / (double) testTimes);


    }

    private static double xTpPower2() {
        double max = Math.max(Math.random(), Math.random());
        System.out.println(max);
        return max;
    }
}
