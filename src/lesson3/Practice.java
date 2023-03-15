package lesson3;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x: ");
        int x = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= (int) Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is not prime");
        }
    }
}
