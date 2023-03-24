package lesson4.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        5.	Daxil olunmuş ədədə qədər bütün sadə ədədləri tapan proqram yazın.
//        Input:                                    Output:
//        20                                           2, 3, 5, 7, 11, 13, 17, 19

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int a= input.nextInt();

        for (int i = 2; i <= a; i++) {
            boolean sadeEded = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sadeEded = false;
                    break;
                }
            }
            if (sadeEded) {
                System.out.print(i + " ");

            }
        }

    }
}
