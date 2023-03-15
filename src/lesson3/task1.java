package lesson3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int i = scanner.nextInt();
        //scanner.close(); Scanneri baglayigiq

        while (i > 0) { //dovurun davam etme serti
            System.out.println(i % 10); //sonuncu reqemin cap edilmesi
            i /= 10; //x-in 10defe azalmasi
        }
    }
}
