package lesson6.task1and2;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        StudentServices service = new StudentServices();
        Scanner input = new Scanner(System.in);

        studentRegistration(service, input);


    }

    private static void studentRegistration(StudentServices service, Scanner input) {
        while (true) {

            printCommand();

            int add = input.nextInt();

            switch (add) {
                case 0 -> {
                    return;
                }
                case 1 -> service.register();
                case 2 -> service.show();
                case 3 -> service.findStudent();
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void printCommand() {
        System.out.println("0. Exit system\n" +
                "1. Register student\n" +
                "2. Show student\n" +
                "3. Search student\n"
        );
    }

}

