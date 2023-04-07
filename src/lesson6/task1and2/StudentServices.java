package lesson6.task1and2;


import java.util.Scanner;

public class  StudentServices {
    private final  Scanner input = new Scanner(System.in);

    private Student[] studentList = new Student[0];

    public void register() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tələbə sayını daxil edin: ");
        int n = input.nextInt();
        studentList = new Student[n];


        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Enter element #" + (i + 1) + ": ");
            System.out.println("Enter the Student name: ");
            String name = input.next();
            System.out.println("Enter the Student surname: ");
            String surname = input.next();
            System.out.println("Enter the Student id: ");
            String id = input.next();
            System.out.println("Enter the Student enterYear: ");
            int enterYear = input.nextInt();
            System.out.println("____________");

            Student student = new Student(name, surname, id, enterYear);

            studentList[i] = student;
        }
    }

    public void show() {

        System.out.println("______ Students info ______");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(i + 1 + ". Student");
            studentList[i].getInfo();
            System.out.println("____________");
        }
    }

    public void findStudent() {

        System.out.print("Enter name or surname: ");
        String search = input.nextLine();
        boolean found = false;


        for (int i = 0; i < studentList.length; i++) {

            if (studentList[i].getName().toLowerCase().contains(search.toLowerCase()) ||
                    (studentList[i].getSurname().toLowerCase().contains(search.toLowerCase()))) {
                System.out.print(i +1);
                studentList[i].getInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("User is not founded.");
        }
    }
}
