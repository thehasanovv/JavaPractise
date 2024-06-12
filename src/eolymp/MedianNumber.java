package eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class MedianNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int[] sides = {n1, n2, n3};
        Arrays.sort(sides);

        System.out.println(sides[1]);
        in.close();
    }
}
