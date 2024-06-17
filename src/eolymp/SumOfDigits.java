package eolymp;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        int sum = firstDigit + lastDigit;

        System.out.println(sum);
    }
}
