package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("brand: ");
        String brand = sc.nextLine();
        System.out.println("model: ");
        String model = sc.nextLine();
        System.out.println("color: ");
        String color = sc.nextLine();

        System.out.println("engine");
        int engine = sc.nextInt();

        System.out.println("year: ");
        int year = sc.nextInt();

        System.out.println("door: ");
        int door = sc.nextInt();

        Car car = new Car();
        car.brand = brand;
        car.model = model;
        car.color = color;
        car.engine  = engine;
        car.year = year;
        car.door = door;

        car.carsPrint();
//        Car.car();
        Mass math = new Mass();
        int sum = math.sum(5,8);
        System.out.println(sum);

    }
}
