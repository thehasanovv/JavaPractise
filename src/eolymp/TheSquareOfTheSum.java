package eolymp;

import java.util.Scanner;

public class TheSquareOfTheSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sumOfDigits = number / 10 + number % 10;
        System.out.print(sumOfDigits * sumOfDigits);
    }
}
