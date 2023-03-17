package lesson3.tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // 1.	Daxil olunmuş ədədi tərsinə çevirən proqram yazın.
        // (Ədədin qalığını tapıb yan yana çap etmək yox.
        // Sonradan mən o ədədin üzərin əməliyyatlar apara bilim.)
        //Input: 321
        //Output: 123


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int r = sc.nextInt();

        int c = 0;

        while (r > 0) {
            int q = r % 10;
            r = r / 10;
            c = c * 10 + q;
        }
        System.out.println(c);
    }
}
