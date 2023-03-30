package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("brand: ");
//        String brand = sc.nextLine();
//        System.out.println("model: ");
//        String model = sc.nextLine();
//        System.out.println("color: ");
//        String color = sc.nextLine();
//
//        System.out.println("engine");
//        int engine = sc.nextInt();
//
//        System.out.println("year: ");
//        int year = sc.nextInt();
//
//        System.out.println("door: ");
//        int door = sc.nextInt();

        Car car = new Car("tesla", "s3", "black", 51,4563,2);
//        car.brand = brand;
//        car.model = model;
//        car.color = color;
//        car.engine = engine;
//        car.year = year;
//        car.door = door;

//        car.carsPrint();

        System.out.println(car.toString());


    }
}
