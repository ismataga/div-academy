package lesson8.TasksArrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        4.	N ölçülü massiv yaradın və bütün dəyərləri console-dan alın.
//        Massivin ölçüsün belə. Daha sonra yazılan bütün elementlərin kvadratını çap edən proqram yazın.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Ededi daxil edin: ");

        int i = 0;
        int arr1 = 0;
        for (i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
            arr1 += arr[i] * arr[i];
        }
        System.out.print(arr1);

    }
}