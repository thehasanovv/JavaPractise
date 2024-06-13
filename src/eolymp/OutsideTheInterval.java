package eolymp;

import java.util.Scanner;

public class OutsideTheInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        System.out.println(x < y || x > z);

        if (x < y || x > z)
            System.out.println("OUT");
        else
            System.out.println("IN");
    }
}
