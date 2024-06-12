package eolymp;

import java.util.Scanner;

public class DivideTheApples1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int children = in.nextInt();
        int apple = in.nextInt();

        System.out.print(apple / children);

        in.close();
    }
}
