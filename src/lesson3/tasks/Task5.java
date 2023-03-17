package lesson3.tasks;

import java.util.Scanner;

public class Task5 {

    //5.	Bizə kibritdən istifadə edərək yan-yana kublar düzəltmək lazımdır.
    // Və bizə elə bir proqram lazımdır ki, yan-yana birləşdirələcək kubların sayını daxil etdikdə neçə dənə kibrit lazım olacağını bizə çap etsin.
    //Kubun hər tərəfi 1 kibrit uzunluğundadır.
    //
    //Input: 3
    //Output: 28


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr number: ");
        int a = sc.nextInt();
        int i = 0;
        int b =4;
        for (i = 0; i < a; i++) {
            b = b + 8;
        }
        System.out.println(b);
    }
}
