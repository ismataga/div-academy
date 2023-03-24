package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cash out: ");
        int[] arr = {1, 5, 10, 20, 50, 100, 200, 500};
        int cash = sc.nextInt();

        int remain = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            remain = 0;
            if (cash > arr[i]) {
                remain = cash / arr[i];
                System.out.println(arr[i] + " - " + remain);
            }
            cash -= remain * arr[i];
        }
    }

}

