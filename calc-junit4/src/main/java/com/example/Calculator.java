package com.example;

/** 정수 중심 계산기 (오버플로우는 과제 범위 제외) */
public class Calculator {
    public int add(int a, int b) {
        return a + b; 
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("divisor (b) must not be zero");
        return a / b;
    }
}
