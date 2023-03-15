package lesson2.tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 3.	0-dan 50-yə qədər tək ədələri çap edən proqram yazın. (Hint: for and if);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int odd = sc.nextInt();

        int i = 0;
        for (i = 0; i < odd; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}
