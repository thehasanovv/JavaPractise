package eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class RectangularOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2))
            System.out.println("Yes");
        else
            System.out.println("No");

        in.close();
    }
}
