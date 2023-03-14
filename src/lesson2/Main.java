package lesson2;

public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Welcome");
        } else if (age < 18 && age > 0) {
            System.out.println("Forbidden");
        } else {
            System.out.println("age incorrect");

        }
    }

}
