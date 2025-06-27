package com.dkte;

public class Fibbonacci {
    public static void main(String[] args) {
        int first = 2;
        int second = 4;

        for (int i = 0; i <= 10; i++) {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
