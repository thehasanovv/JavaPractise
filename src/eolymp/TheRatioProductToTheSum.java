package eolymp;

import java.util.Scanner;

public class TheRatioProductToTheSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.close();

        int productOfDigits = 1;
        int sumOfDigits = 0;

        long temp = number;
        while (temp > 0) {
            int digit = (int) (temp % 10);
            sumOfDigits += digit;
            productOfDigits *= digit;
            temp /= 10;
        }
        double result = (double) productOfDigits / sumOfDigits;

        System.out.printf("%.3f%n", result);
    }
}
