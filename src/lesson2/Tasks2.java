package lesson2;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {

        //1.	Yaş 18dən böyük bərabərdirsə “Welcome”, əks halda “Access denied” çap edən proqram yazın.
        // Bunu Ternary istifadə edərək yazın.


        //4.	Bir ədədin bütün rəqəmlərini ayrı-ayrılığda çap edən proqram yazın.
        // Məsələn, 562 ədədini yazmışığsa console-da bizə

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int c = 0;

        while (r > 0) {
            int q = r % 10;
            r = r / 10;
            c = c * 10 + q;
        }

        int seperate = 0;
        while (c > 0) {
            int q = c % 10;
            c = c / 10;
            seperate = q;
            System.out.println(seperate);
        }


    }
}
