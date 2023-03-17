package lesson3.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        4.	Daxil olunmuş ədədin neçə rəqəmli olduğunu tapan proqram tərtib edin.
//        Input: 354634
//        Output: 6

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr number: ");
        int a = sc.nextInt();
        int i = 0;
        for ( i = 0; a > 0;i++) {
            a = a/10;
        }
        System.out.println(i);

    }
}
