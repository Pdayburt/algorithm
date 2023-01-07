package com.anatkh.algorithm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AlgorithmApplicationTests {
    @Test
    void printBinaryForInt(){
       print(110);
       System.out.println();
        //～p + 1 = -p
        System.out.println(~110+1);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(~Integer.MIN_VALUE+1);
        System.out.println(-Integer.MIN_VALUE);
       int a = Integer.MIN_VALUE;
       print(a);
        System.out.println();
        //带符号右移，Java是有符号的 默认，
        // 右移后最高位用什么树来补？带符号的用符号位来补 不带符号的 用0
       print(a >> 1);
        System.out.println();
        //不带符号右移
       print(a >>> 1);
        System.out.println();
        //左移直接去掉高位的树，低位用0补
       print(a << 1);
    }
    void print(int num){
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0?"0":"1");
        }
    }



}
