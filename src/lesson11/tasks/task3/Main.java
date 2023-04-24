package lesson11.tasks.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vegetable veg = null;
  
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text: " +
                    "\nTomato" +
                    "\nOnion" +
                    "\nGarlic");
            String text = sc.next();
            System.out.print("Enter received kilograms: ");
            int kg = sc.nextInt();
            switch (text.toLowerCase()) {
                case "tomato" -> veg = new Tomato(text, kg);
                case "onion" -> veg = new Onion(text, kg);
                case "garlic" -> veg = new Garlic(text, kg);
                default -> System.out.println("Invalid input");
            }
            System.out.println("Vegetable name: " + veg.vegetableName());
            System.out.println("Received kilograms: " + veg.receivedKg());
            System.out.println("Price: " + veg.price());
        
        
    }
}
