package eolymp;

import java.util.Scanner;

public class WhichQuarter {
    private static final int FIRST_QUADRANT = 1;
    private static final int SECOND_QUADRANT = 2;
    private static final int THIRD_QUADRANT = 3;
    private static final int FOURTH_QUADRANT = 4;
    private static final int ON_AXIS_ORIGIN = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();

        int quadrant = determineQuadrant(x, y);

        System.out.println(quadrant);
    }

    public static int determineQuadrant(double x, double y) {
        if (x > 0 && y > 0) return FIRST_QUADRANT;
        else if (x < 0 && y > 0) return SECOND_QUADRANT;
        else if (x < 0 && y < 0) return THIRD_QUADRANT;
        else if (x > 0 && y < 0) return FOURTH_QUADRANT;
        else return ON_AXIS_ORIGIN;
    }
}
