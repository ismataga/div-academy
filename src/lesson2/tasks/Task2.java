package lesson2.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

       // 2.	Həftənin günlərini ingilis dilində çap edən proqram yazın.
        // Bunu switch-case istifadə edərək yazın.
        Scanner sc = new Scanner(System.in);
        System.out.println("edei daxil edin");
        int weekday = sc.nextInt();

        switch (weekday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


    }
}
