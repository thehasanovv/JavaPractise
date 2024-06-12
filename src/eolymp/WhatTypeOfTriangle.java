package eolymp;

import java.util.Scanner;

public class WhatTypeOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if(n1 == n2 && n1 == n3) System.out.print(1);
        else if(n1 == n2 || n1 == n3 || n2 == n3) System.out.print(2);
        else System.out.print(3);
    }
}
