package lesson4.tasks;

import java.util.Scanner;

public class Task7v24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n-i daxil edin: ");
        int n = input.nextInt();
        int[] primes = new int[n];
        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        System.out.print("Ilk " + n + " sade eded: ");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}




