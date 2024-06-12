package eolymp;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 1;

        for (int i = 0; i <= number; i++) {
            result *= number % 10;
            number = number / 10;
        }

        System.out.println(result);
    }
}
