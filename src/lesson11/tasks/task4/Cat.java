package lesson11.tasks.task4;

import java.util.Scanner;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public  String getName() {
        return name;
    }

    @Override
    public String makeNoise() {
      return "Miyov";
    }



}
