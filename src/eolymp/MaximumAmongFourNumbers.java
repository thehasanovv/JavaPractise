package eolymp;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAmongFourNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int[] numArr = new int[4];

        for (int i = 0; i < 4; i++) {
            number = in.nextInt();
            numArr[i] = number;
        }

        Arrays.sort(numArr);
        System.out.println(numArr[numArr.length - 1]);

        in.close();
    }
}
