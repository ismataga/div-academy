package lesson6.exampl4;

import lesson6.exampl4.global.Global;

import java.util.Scanner;

public class StudentServices {
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tələbə sayını daxil edin: ");
        int n = sc.nextInt();

        Global.students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element #" + (i + 1) + ": ");
            System.out.println("Enter the Student name: ");
            String name = sc.next();
            System.out.println("Enter the Student surname: ");
            String surname = sc.next();
            System.out.println("Enter the Student id: ");
            String id = sc.next();
            System.out.println("Enter the Student enterYear: ");
            int enterYear = sc.nextInt();
            System.out.println("____________");

            Student student = new Student(name, surname, id, enterYear);

            Global.students[i] = student;
        }

        public static void show(){
            for (int i=0;i<Global.students.length; i++){
                System.out.println("____________");
                System.out.println(i+1+". Student");
                Global.students[i].getInfo() ;
                System.out.println("____________");
            }

        }
}
