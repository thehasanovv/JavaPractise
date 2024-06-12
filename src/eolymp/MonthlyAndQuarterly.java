package eolymp;

import java.util.Scanner;

public class MonthlyAndQuarterly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch (number) {
            case 1, 2, 3 -> System.out.println("First");
            case 4, 5, 6 -> System.out.println("Second");
            case 7, 8, 9 -> System.out.println("Third ");
            case 10, 11, 12 -> System.out.println("Fourth");
            default -> System.out.println("(1 ≤ N ≤ 12)");
        }

        in.close();
    }
}
