package lesson8.TasksArrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //1.	 Daxil edilmiş ədədin, massivin içərisində hansı index-də olduğunu tapan proqram yazın.
        // Yəni biz dəyəri console-dan daxil edirik.
        // O isə bizə həmin dəyərin massivin hansı sırasında yerləşdiyini tapıb bizim üçün çap edir.


        Scanner input = new Scanner(System.in);
        int[] arr = {4, 5, 1, 8, 2, 9, 10, 3};

        System.out.print("Axtarmaq istediyiniz ededi daxil edin: ");
        int num = input.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Dəyər tapılmadı.");
        } else {
            System.out.println("Dəyər " + index + " indeksində tapıldı.");
        }
    }
}
