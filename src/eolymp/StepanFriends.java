package eolymp;

import java.util.Scanner;

public class StepanFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int numberOfFriends = n - 1;
        System.out.println(numberOfFriends);
    }
}
