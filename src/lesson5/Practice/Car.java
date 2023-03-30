package lesson5.Practice;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int engine;
    public int year;
    public int door;

    //access modifier return
    public void carsPrint() {
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
        System.out.println("engine: " + engine);
        System.out.println("year: " + year);
        System.out.println("door: " + door);

    }

    public Car(String brand, String model, String color, int engine, int year, int door) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.year = year;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                ", door=" + door +
                '}';
    }
}
