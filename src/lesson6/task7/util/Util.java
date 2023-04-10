package lesson6.task7.util;

import java.util.Scanner;

public class Util {
    public static int inputRequiredInt(String title) {
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        return input.nextInt();
    }

    public static String inputRequiredString(String title) {
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        return input.nextLine();
    }
}
