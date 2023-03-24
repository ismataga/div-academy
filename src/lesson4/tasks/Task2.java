package lesson4.tasks;

import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {
        //2.	String str = “1,2,3,4,5,6,7,8,9”; verilmiş sətirdə hər bir rəqəm arasında olan vergülü,
        // vergül boşluğa dəyişin. Yəni -> “1, 2, 3, 4, 5, 6, 7, 8, 9” – çap olunsun.
        String  str  = "1,2,3,4,5,6,7,8,9";
        String s = str;
        System.out.println(s.replaceAll(",", ", "));
    }
}
