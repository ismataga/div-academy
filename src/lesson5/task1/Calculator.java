package lesson5.task1;

public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static double mul(double x, double y) {
        return x * y;
    }

    public static double div(double x, double y) {
        return x / y;
    }

    public static int factorial(double x) {
        int a = 1;
        if (x > 0) {

            for ( int i = 1; i <= x; i++) {
                a = a * i;
            }
        }
        return a;
    }

    public static double mathPow(double x, double y) {
        return Math.pow(x,y);
    }
}
