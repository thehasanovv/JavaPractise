package eolymp;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int quotient = a / b;
        int remainder = a % b;

        if (remainder == 0)
            System.out.println("Divisible");
        else
            System.out.printf("%d %d", quotient, remainder);
    }
}
