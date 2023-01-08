package com.anatkh.algorithm.greenHand.random;

public class EqualProbabilityRandom0108 {



    //函数f()等概率返回1~5，要求等概率返回1~7。
    public static void main(String[] args) {
        int[] counts = new int[8];
        int testTimes = 1000000;
        for (int i = 0; i < testTimes; i++) {
            int res = oneSeven();
            counts[res]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
    static int oneSeven(){
        int num = 0;
        do {
            num = (zeroOne() << 2) + (zeroOne() << 1) + zeroOne();
        }while (num == 0);
        return num;
    }

    //假设f是lib里的不能改
    static int f(){
        return (int)(Math.random()*5)+1;
    }
    //随即机制，只能使用f 等概率返回0，1
    static int zeroOne(){
        int ans = 0;
        do {
            ans = f();
        }while (ans == 3);
        return ans < 3?0:1;
    }

}
