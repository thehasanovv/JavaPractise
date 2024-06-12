package eolymp;

import java.util.Scanner;

public class InsideTheInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if (n1 >= n2 && n1 <= n3) System.out.print("YES");
        else System.out.print("NO");

        in.close();
    }
}
