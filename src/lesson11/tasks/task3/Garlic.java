package lesson11.tasks.task3;

import java.util.Scanner;

public class Garlic implements Vegetable{

    private String name;
    private int kg;

    public Garlic(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }
    @Override
    public String vegetableName() {
        return name;
    }
    @Override
    public int receivedKg() {
        return kg;
    }
    @Override
    public double price() {
        return kg * 4.0;
    }
}
