package lesson8.TasksArrays.task14;

import java.util.Scanner;

public class Main {

    private  static  Person[] persons = new Person[10];

    private static int count =0;
    public static void main(String[] args) {

        while (true) {
            System.out.println("----| Enter menu|-----");
            System.out.println("0.Exit" + "\n" +
                    "1.CreatePerson" + "\n" +
                    "2.UsernameAndPassword");

            int option = inputInt("Enter option: ");
            switch (option) {
                case 0: {
                    return;
                }
                case 1:
                    createPerson();
                    break;
                case 2:
                    usernameAndPassword();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    public static void usernameAndPassword(){
        while (true) {
            System.out.println("----| Enter menu|-----");
            System.out.println("0. Exit" + "\n" +
                    "1.Username" + "\n" +
                    "2.Password");

            int option = inputInt("Enter option: ");
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
    public static void  createPerson(){
        Person person = new Person(inputStr("Enter username: "),inputStr("Password: ") );
        persons[count]= person;
        count++;

    }
    private static int inputInt(String title) {
        Scanner inputInt = new Scanner(System.in);
        System.out.println(title);
        return inputInt.nextInt();
    }

    private static String inputStr(String title) {
        Scanner inputStr = new Scanner(System.in);
        System.out.println(title);
        return inputStr.nextLine();
    }

    public static void username() {
        for (Person person : persons) {
            if (person.getUsername().equals(inputStr("Enter username: "))) {
                System.out.println("Welcome " + person.getUsername());
            } else {
                System.out.println("Username is invalid");
            }
            break;
        }
    }

    public static void password() {
        for (Person person : persons) {
            if (person.getPassword().equals(inputStr("Enter password: "))) {
                System.out.println("Welcome " + person.getPassword());
            } else {
                System.out.println("Password is invalid");
            }
            break;
        }
    }

}
