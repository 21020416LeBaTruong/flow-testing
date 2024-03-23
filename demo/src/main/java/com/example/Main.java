package com.example;

public class Main {

    public static int kilometers(int x) {
        if (x <= 3) {
            return x * 30;
        } else if (x <= 7) {
            return 3 * 30 + (x - 3) * 20;
        } else {
            return 3 * 30 + 4 * 20 + (x - 7) * 15;
        }
    }

    public static int price(int x) {
        if (x <= 0 || x > 10)
            return -1;
        return kilometers(x);
    }
}