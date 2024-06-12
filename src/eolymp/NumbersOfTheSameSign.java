package eolymp;

import java.util.Scanner;

public class NumbersOfTheSameSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if(n1 * n2 > 0) System.out.print(1);
        else System.out.print(0);

        in.close();
    }
}
