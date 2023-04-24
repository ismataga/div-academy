package lesson11.tasks.task1;

import java.util.Scanner;

public class Crcile implements Shape {

    @Override
    public double getArea() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double r = sc.nextDouble();
        double p = 3.14;
        double getArea = p * r * r;
        return getArea;

    }
}
