package lesson8.TasksArrays;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        while (true) {
            Scanner inputInt = new Scanner(System.in);
            System.out.println("----| Enter menu|-----");
            System.out.println("0. Exit" + "\n" +
                    "1.Username" + "\n" +
                    "2. Password");

            Scanner input = new Scanner(System.in);
            int option = inputInt.nextInt();
            switch (option) {
                case 0: {
                    return;
                }
                case 1:
                    username();
                    break;
                case 2:
                    password();
                    break;
                default:
                    System.out.println("Invalid input");

            }


        }
    }



        public static void username () {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Username: ");
            String username = input.nextLine();
            if (username.equals(input.nextLine())) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Username is invalid");
            }
        }

        public static void password () {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Password");
            String password = input.nextLine();
            if (password.equals(input.nextLine())) {
                System.out.println("Password: " + password);
            } else {
                System.out.println("Password is invalid");
            }
        }

}
