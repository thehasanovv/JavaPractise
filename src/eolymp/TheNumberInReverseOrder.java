package eolymp;

import java.util.Scanner;

public class TheNumberInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(0);
        }

        while (num > 0) {
            int digits = num % 10;
            num /= 10;
            System.out.println(digits);
        }
    }
}
