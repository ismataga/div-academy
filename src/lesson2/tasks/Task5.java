package lesson2.tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


//        5.	Ədədin faktorialını tapan proqram yazın.
//
//      Faktorial –  1-dən başlayarağ, verilən ədədə qədər ədədlərin bir-birinə hasilidir.
//      Məsələn, 5-in faktorialını tapmaq istəyiriksə
//        1*2*3*4*5 = 120
//        Cavab: 5! = 120
//        (for-dan istifafadə edəcəksiniz.)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int fac = sc.nextInt();
        int i = 1;
        int f = 1;
        for (i = 1; i <= fac; i++) {
            f = f * i;
        }
        System.out.println(f);


    }
}
