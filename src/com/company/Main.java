package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 25;
        int b = 31;
        int c = a >> 3;
        System.out.println(c);

        int d = a >>> 2;
        System.out.println(d);

        int e = a & b;
        System.out.println(e);

        int f = a | b;
        System.out.println(f);

        int g = a ^ b;
        System.out.println(g);

        int h = ~b;
        System.out.println(h);

        int i = b << 3;
        System.out.println(i);
    }
}
