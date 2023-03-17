package lesson3.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2.	3-cü dəyişəndən istifadə etmədən, 2 dəyişənin yerini dəyişin.
        // Yəni int tipində 2 dəyişən təyin edirsiz, x və y daha sonra elə bir əməliyyat yazırsız ki, mən x-i çağıranda y-in qiyməti, y-i çağıranda isə x-in qiymətini görürəm.
        // Və bunu yazarkən 3-cü dəyişən təyin etmək olmaz.


        int a =3;
        int b =8;
         a = b-a;
         b = b-a;
         a = a+b;
        System.out.println("a= " + a+ " " + "b= " + b);
    }
}
