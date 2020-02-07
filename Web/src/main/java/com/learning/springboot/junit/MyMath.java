package com.learning.springboot.junit;

public class MyMath {
    int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}