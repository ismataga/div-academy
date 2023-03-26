package lesson4.tasks;

import java.util.Scanner;

public class Task7v24 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ededi daxil edin: ");
//        int n = sc.nextInt();
      boolean a = isPrime(sc.nextInt());
        System.out.println(a);

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