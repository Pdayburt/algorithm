package com.anatkh.algorithm.review;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestRandom {

    @Test
    void testMyEqualRandom(){
        //函数f()等概率返回1~5，要求等概率返回1~7。
        int[] counts = new int[8];
        int testTimes = 1000000;
        for (int i = 1; i < testTimes; i++) {
            int oneSeven = oneSeven();
            counts[oneSeven]++;
        }
        myPrintArr(counts);

    }

    @Test
    void testMyUnEqualRandom(){
        //函数f() 0概率P,1概率1-p ,要求写一个函数等概率返回0，1
        int testTimes = 100000;
        int[] counts = new int[2];
        for (int i = 0; i < testTimes; i++) {
            counts[NEqual()] ++;
        }
        myPrintArr(counts);
    }

    int f(){
        return Math.random() <0.65? 0: 1;
    }

    /**
     * 00 01 10 11
     *
     */
    int NEqual(){
        int res = 0;
        do {
            res = f();
        }while (res == f());
        return res == 1 ? 0 : 1;
    }



    void myPrintArr(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

    int oneFive(){
        return (int) ((Math.random()*5)+1);
    }
    int zeroOne(){
        int zeroOne = 0;
        do {
            zeroOne = oneFive();
        }while (zeroOne == 3);
        return zeroOne < 3 ? 0 : 1;
    }
    int oneSeven(){
        int oneSeven = 0;
        do {
            oneSeven = (zeroOne() << 2) + (zeroOne() << 1) + zeroOne();
        }while (oneSeven == 0);
        return oneSeven;
    }
}
