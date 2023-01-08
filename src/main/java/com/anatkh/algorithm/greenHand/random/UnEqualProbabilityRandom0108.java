package com.anatkh.algorithm.greenHand.random;

public class UnEqualProbabilityRandom0108 {
    //函数f() 0概率P,1概率1-p ,要求写一个函数等概率返回0，1
    public static void main(String[] args) {
        int[] counts = new int[2];
        int testTimes = 1000000;
        for (int i = 0; i < testTimes; i++) {
            int res = zeroOne();
            counts[res]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
    static int fixedZeroOne(){
        return Math.random() < 0.65? 0:1;
    }
    static int zeroOne(){
        int res = 0;
        do {
            res  = fixedZeroOne();
        }while (res == fixedZeroOne());
        return res == 1?0:1;
        //第二种方法
//        do {
//            res  = (fixedZeroOne()<<1)+fixedZeroOne();
//        }while (res == 0 || res == 3);

    }
}
