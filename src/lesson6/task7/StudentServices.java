package lesson6.task7;

import lesson6.task7.global.Global;
import lesson6.task7.util.Util;

import java.util.Arrays;

import static lesson6.task7.util.Util.inputRequiredString;


public class StudentServices {
    public static Student fillStudent() {
        String name = inputRequiredString("Enter the Student name: ");
        String surname = inputRequiredString("Enter the Student surname: ");
        String id = inputRequiredString("Enter the Student id: ");
        int enterYear = Util.inputRequiredInt("Enter the Student enterYear: ");
        return new Student(name, surname, id, enterYear);
    }


    public void register() {
        int count = Util.inputRequiredInt("Tələbə sayını daxil edin: ");
        if (Global.studentList.length == 0) {
            Global.studentList = new Student[count];
            for (int i = 0; i < Global.studentList.length; i++) {
                System.out.println("Enter element #" + (i + 1) + ": ");
                Global.studentList[i] = fillStudent();
            }
        } else {
            Student[] tempStudent = Global.studentList;
            Global.studentList = new Student[tempStudent.length + count];
            for (int i = 0; i < Global.studentList.length; i++) {
                if (tempStudent.length - 1 >= i) {
                    Global.studentList[i] = tempStudent[i];

                } else {
                    System.out.println("Enter element #" + (i + 1) + ": ");
                    Global.studentList[i] = fillStudent();

                }
            }
        }
    }

    public void show() {

        System.out.println("______ Students info ______");
        for (int i = 0; i < Global.studentList.length; i++) {
            System.out.println(i + 1 + ". Student");
            Global.studentList[i].getInfo();
            System.out.println("____________");
        }


    }


    public void findStudent() {
        String input = inputRequiredString("Enter name and surname");
        boolean found = false;

        for (int i = 0; i < Global.studentList.length; i++) {
            if (Global.studentList[i].getName().toLowerCase().contains(input.toLowerCase()) ||
                    (Global.studentList[i].getSurname().toLowerCase().contains(input.toLowerCase()))) {
                System.out.print(i + 1);
                Global.studentList[i].getInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("User is not founded.");
        }
    }


    public void delete() {

        show();
        int index = Util.inputRequiredInt("\nEnter the number of the username you want to delete: ") - 1;

        if (index < 0 || index >= Global.studentList.length) {
            System.out.println("Invalid index. Please try again.");
            return;
        }
        int i = 0;
        for (i = index; i < Global.studentList.length - 1; i++) {
            Global.studentList[i] = Global.studentList[i + 1];
        }
        Global.studentList = Arrays.copyOf(Global.studentList, Global.studentList.length - 1);

        System.out.println("\nDeleted is successfully!\n");
    }


    public void replaceUsername() {
        show();
        int index = Util.inputRequiredInt("\nEnter the number of the username you want to update: ") - 1;
        if (index >= 0 && index < Global.studentList.length) {
            Global.studentList[index].setUsername(inputRequiredString("Rename username"));
        } else {
            System.out.println("\nInvalid choice!\n");
        }
        System.out.println("\nRenamed user is successfully!\n");

    }
}



