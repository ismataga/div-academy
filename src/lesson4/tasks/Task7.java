package lesson4.tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
        int n = sc.nextInt();

        int[] primes = new int[n];
        int index = 0;

        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 0; i < index; i++) {
            System.out.print( primes[i] + ",");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}