package lesson8.TasksArrays;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
//        11.	Daxil edilən sətirdə hansı simvoldan neçə dəfə istifadə olunduğunu çap edən proqram yazın.

//        int[] arr = new int[256];
//        String str = "java 52";
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            arr[str.charAt(i)]++;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) System.out.println((char) i + " - " + arr[i]);
//        }


        Scanner input = new Scanner(System.in);
        System.out.print("Sətir daxil edin: ");
        String str = input.nextLine();

        // Simvolların sayını hesablayan dövr
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // Simvolların sayını çapa verin
            System.out.println("'" + str.charAt(i) + "' simvolu " + count + " dəfə istifadə edilib.");

        }
    }
}


