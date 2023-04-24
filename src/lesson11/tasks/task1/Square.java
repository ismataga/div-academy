package lesson11.tasks.task1;

import java.util.Scanner;

public class Square implements Shape {

    @Override
    public double getArea() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double a = sc.nextDouble();
        double getArea = a * a;
        return getArea;

    }
}
