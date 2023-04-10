package lesson6.task7.model;

import lesson6.task7.StudentServices;
import lesson6.task7.util.Util;

public class Model {
    public static void studentRegistration() {
        StudentServices service = new StudentServices();
        while (true) {

            printCommand();
            int option = Util.inputRequiredInt("Enter option: ");

            switch (option) {
                case 0 -> {
                    return;
                }
                case 1 -> service.register();
                case 2 -> service.show();
                case 3 -> service.delete();
                case 4 -> service.replaceUsername();
                case 5 -> service.findStudent();
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void printCommand() {
        System.out.println("0. Exit system\n" +
                "1. Register student\n" +
                "2. Show student\n" +
                "3. Delete student\n" +
                "4. Update student\n" +
                "5. Search student\n"
        );
    }
}
