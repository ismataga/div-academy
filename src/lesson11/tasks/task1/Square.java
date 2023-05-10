package lesson11.tasks.task1;

import java.util.Scanner;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
