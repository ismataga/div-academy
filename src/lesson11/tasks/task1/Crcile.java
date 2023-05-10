package lesson11.tasks.task1;

import java.util.Scanner;

public class Crcile implements Shape {
    private double radius;

    public Crcile(double radius) {
        this.radius = radius;
    }



    @Override
    public double getArea() {
        return Math.PI*radius*radius;

    }
}
