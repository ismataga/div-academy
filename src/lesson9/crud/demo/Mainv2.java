package lesson9.crud.demo;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Mainv2 {

    private static Person[] persons;
    private static List<Person> personList = new ArrayList<>();


    private static int count = 0;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMenu(input);


    }

    public static int inputInt(Scanner input, String title) {
        System.out.print(title);
        return input.nextInt();
    }

    public static long inputLong(Scanner input, String title) {
        System.out.print(title);
        return input.nextLong();
    }

    public static String inputStr(Scanner input, String title) {
        System.out.print(title);
        return input.nextLine();
    }

    public static void printCommand() {
        System.out.println("" +
                "----|Enter menu|----");
        System.out.println("0. Exit system\n" +
                "1. Enter length of array\n" +
                "2. Create person\n" +
                "3. Read person\n" +
                "4. Find person by id\n" +
                "5. Update persons by id\n" +
                "6. Delete person\n");
    }

    public static void showMenu(Scanner input) {

        while (true) {
            printCommand();
            int option = inputInt(input, "Enter option: ");
            switch (option) {
                case 0 -> {
                    return;
                }
                case 1 -> lengthOfArray(input);
                case 2 -> createPerson(input);
                case 3 -> readPerson();
                case 4 -> findPersonById(input);
                case 5 -> updatePerson(input);
                case 6 -> deletePerson(input);
                default -> System.out.println("Invalid option");
            }
        }
    }

    private static void lengthOfArray(Scanner input) {
        int n = inputInt(input, "Massivin olcusunu daxil et:  ");
        persons = new Person[n];
    }


    private static void deletePerson(Scanner input) {
        long isForDeleted = inputInt(input,"Axtardigimiz id: ");
        ;
        if (deleteById(isForDeleted)) {
            System.out.println("Id-si " + isForDeleted + " olan person silindi");
        } else {
            System.out.println("Id-si " + isForDeleted + " olan person tapilmadi");
        }
    }

    private static void updatePerson(Scanner input) {

        //id scannerden oxu
        //yeni personun melumatalrinin scannerden daxil edek

        Person newPerson = new Person(inputLong(input,"Enter id: "),
                inputStr(input,"Enter name: "),
                inputStr(input,"Enter surname: "),
                (byte) inputInt(input, "Enter age: "));///yash
        //update metodnu cagiraq

        Person updatePerson = updatePersonById(newPerson.getId(), newPerson);
        //eger person null ise
        if (updatePerson == null) {
            //mesaji cap et
            System.out.println("Hec bir person deyismedi");
        } else {
            //eks halda personu cap et
            System.out.println(updatePerson);
        }
    }

    private static void findPersonById(Scanner id) {
        //id scannerden oxu
        //id esasinda pesonu axtar
        Person person = getPersonById(sc.nextLong());

        //eger person null ise
        if (person == null) {
            //mesaj cap et
            System.out.println("Id-si " + id + " olan Person yoxdur");
        } else {
            //eks halda personu cap et
            System.out.println(person);
        }
    }

    public static Person createPerson(Scanner input) {
        Person p1 = new Person(sc.nextLong(),
                sc.nextLine(),
                sc.nextLine(),
                (byte) sc.nextInt());

        if (persons.length == count) {
            Person[] newLength = new Person[persons.length * 2];
            for (int i = 0; i < persons.length; i++) {
                newLength[i] = persons[i];
            }
            persons = newLength;
        }
        persons[count++] = p1;
        return p1;

    }


    public static void readPerson() {
        for (int i = 0; i < count; i++) {
            System.out.println(persons[i]);
        }
    }

    public static Person getPersonById(long id) {
        //massivdeki her bir peson ucun
        for (int i = 0; i < count; i++) {
            //eger personun id velien id beaberdise
            if (persons[i].getId() == id) {
                //hemin personu qaytar
                return persons[i];
            }
        }
        return null;
    }

    public static Person updatePersonById(long id, Person newPerson) {
        Person person = getPersonById(sc.nextLong());
        if (person != null) {
            person.setName(newPerson.getName());
            person.setSurname(newPerson.getSurname());
            person.setAge(newPerson.getAge());
            return person;
        } else {
            return null;
        }
    }


    public static boolean deleteById(long id) {
        //her bir person ucun
        for (int i = 0; i < count; i++) {
            //eger personun id verilmis id beraberdirse
            if (persons[i].getId() == id) {
                //sonuraki her bir pesonu evvelki persona  menimset
                for (int j = i; j < count - 1; j++) {
                    persons[j] = persons[j + 1];
                }
                //sonda sonuncu pesona null menimset
                persons[--count] = null;
                //true qaytar
                return true;
            }
        }
        //eger hec biri tapilmadisa false qaytar
        return false;
    }


}
