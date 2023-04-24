package lesson11.tasks.task3;

import java.util.Scanner;

public class Onion implements Vegetable{
    private String name;
    private int kg;

    public Onion(String name, int kg) {
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
        return kg * 2.5;
    }
}
