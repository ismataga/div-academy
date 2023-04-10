package lesson8.StudentManagmentSystem.util;

import java.util.Scanner;

public class Util {

    public static int recallInt(String title){
        Scanner input = new Scanner(System.in);
       return input.nextInt();
    }
    public static String recallStr(String title){
        Scanner input = new Scanner(System.in);
       return input.nextLine();
    }
}
