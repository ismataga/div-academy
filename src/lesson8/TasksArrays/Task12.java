package lesson8.TasksArrays;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

//12.	Daxil edilmiş sətirdə neçə sait və neçə samit olduğunu tapan proqram tərtib edin.
        Scanner input = new Scanner(System.in);
        System.out.print("Sətir daxil edin: ");
        String str = input.nextLine();
        int sait_count = 0;
        int samit_count = 0;

        // Sait və samitlərin sayını hesablayan dövr
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sait_count++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                samit_count++;
            }
        }

        // Sait və samitlərin sayını çapa verin
        System.out.println("Saitlərin sayı: " + sait_count);
        System.out.println("Samitlərin sayı: " + samit_count);
    }
}
