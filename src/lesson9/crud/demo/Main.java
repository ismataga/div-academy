package lesson9.crud.demo;

import java.util.Scanner;


public class Main {
    private static Person[] persons;

    private static int count = 0;

    public static void main(String[] args) {
        inputArraySize();
        showMenu();
    }

    public static void inputArraySize() {
        int n = inputInt("Enter array's size: ");
        persons = new Person[n];
    }

    public static int inputInt(String title) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print(title);
        return inputInt.nextInt();
    }

    public static String inputStr(String title) {
        Scanner inputStr = new Scanner(System.in);
        System.out.print(title);
        return inputStr.nextLine();
    }


    public static void createPerson(Person person) {
        long id = person.getId();

        for (Person currPerson : persons) {
            if (currPerson != null) {
                if (currPerson.getId() == id) {
                    System.out.println("Id already exist.");
                    return;
                }
            }
        }

        persons[count] = person;
        count++;
    }

    private static Person inputPersonData() {
        return new Person(inputInt("Enter id: "), inputStr("Enter name: "), inputStr("Enter surname: "), (byte) inputInt("Enter age: "));
    }


    public static void printCommand() {
        System.out.println("" +
                "----|Enter menu|----");
        System.out.println("0. Exit system\n" +
                "1. Create person\n" +
                "2. Show person\n" +
                "3. Update person\n" +
                "4. Delete person\n"
        );

    }

    public static void showMenu() {

        while (true) {
            printCommand();

            int option = inputInt("Enter option: ");

            switch (option) {
                case 0 -> {
                    return;
                }
                case 1 -> createPerson(inputPersonData());
                case 2 -> showPerson();
                case 3 -> updatePerson();
                case 4 -> deletePerson(inputInt("Enter id: "));
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void showPerson() {
        for (Person person : persons) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }

    public static void updatePerson() {

        long id = inputInt("Enter id: ");
        for (Person person : persons) {
            if (person != null) {
                if (person.getId() == id) {
                    person.setName(inputStr("Enter name: "));
                    person.setSurname(inputStr("Enter surname: "));
                    person.setAge((byte) inputInt("Enter age: "));
                }
            }
        }
    }

    public static void deletePerson(int id) {
        boolean isDeleted = false;
        for (int i = 0; i < count; i++) {
            if (persons[i] != null) {
                if (persons[i].getId() == id) {
                    persons[i] = null;
                    isDeleted = true;
                    count--;
                }
            }
            if (isDeleted) {
                if (persons.length - 1 != i) {
                    persons[i] = persons[i + 1];
                    persons[i + 1] = null;
                }
            }
        }
        if (!isDeleted) {
            System.out.println("User not found by id: " + id);
        } else {
            System.out.println("User deleted successfully!");
        }

    }
}

