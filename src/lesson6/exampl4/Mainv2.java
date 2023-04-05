package lesson6.exampl4;

import java.util.Scanner;

public class Mainv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element #" + (i+1) + ": ");
            arr[i] = input.next();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
