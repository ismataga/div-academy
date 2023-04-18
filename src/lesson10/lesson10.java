package lesson10;


import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {

        Person person1= new Person();
//        person1.setId(6);
        Person person = new Person();
            person.getId();
            person.getName();
            person.getAge();
            person.getSubject();
            person.getExperience();


        System.out.println(person1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n1 = scanner.nextInt();

            for (int j = 0; j < n1; j++) {
                int result = a;
                for (int k = 0; k <= j; k++) {
                    result += Math.pow(2, k) * b;
                }
                System.out.print(result + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
