package lesson2.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1.	Yaş 18dən böyük bərabərdirsə “Welcome”, əks halda “Access denied” çap edən proqram yazın.
        // Bunu Ternary istifadə edərək yazın.

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println((18 >= age) ? "Welcome" : "Access denied"   );

    }
}
