package lesson9.crud.demo;


import java.util.HashSet;
import java.util.Scanner;

public class MainV5HasSet {
    static Scanner sc = new Scanner(System.in);

    private static HashSet<Person> personList = new HashSet<>();


    public static void main(String[] args) {
        showMenu();
    }

    public static int inputInt(String title) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print(title);
        return inputInt.nextInt();
    }

    public static long inputLong(String title) {
        Scanner inputLong = new Scanner(System.in);
        System.out.print(title);
        return inputLong.nextLong();
    }

    public static String inputStr(String title) {
        Scanner inputStr = new Scanner(System.in);
        System.out.print(title);
        return inputStr.nextLine();
    }

    public static void printCommand() {
        System.out.println("" +
                "----|Enter menu|----");
        System.out.println("0. Exit system\n" +
                "1. Create person\n" +
                "2. Read person\n" +
                "3. Find person by id\n" +
                "4. Update persons by id\n" +
                "5. Delete person\n");
    }

    public static void showMenu() {

        while (true) {
            printCommand();
            int option = inputInt("Enter option: ");
            switch (option) {
                case 0 -> {
                    return;
                }
                case 1 -> createPerson();
                case 2 -> readPerson();
                case 3 -> findPersonById(inputLong("Axtardigimiz id: "));
                case 4 -> updatePerson();
                case 5 -> deletePerson();
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static Person createPerson() {
        Person p1 = new Person(inputLong("Enter id: "), inputStr("Enter name: "), inputStr("Enter surname: "), (byte) inputInt("Enter age: "));
        personList.add(p1);
        return p1;
    }

    public static void readPerson() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static void findPersonById(long id) {
        //id scannerden oxu
        //id esasinda pesonu axtar
        Person person = getPersonById(id);
        //eger person null ise
        if (person == null) {
            //mesaj cap et
            System.out.println("Id-si " + id + " olan Person yoxdur");
        } else {
            //eks halda personu cap et
            System.out.println(person);
        }
    }


    public static Person getPersonById(long id) {
        //massivdeki her bir peson ucun
        for (Person person : personList) {
            //eger personun id verilen id beraberdise
            if (person.getId() == id) {
                //hemin personu qaytar
                return person;
            }
        }
        return null;
    }


    private static void updatePerson() {

        //id scannerden oxu
        //yeni personun melumatalrinin scannerden daxil edek

        Person newPerson = new Person(inputLong("Enter id: "), inputStr("Enter name: "), inputStr("Enter surname: "), (byte) inputInt("Enter age: "));///yash
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

    public static Person updatePersonById(long id, Person newPerson) {
        Person person = getPersonById(id);
        if (person != null) {
            person.setName(newPerson.getName());
            person.setSurname(newPerson.getSurname());
            person.setAge(newPerson.getAge());
            return person;
        } else {
            return null;
        }
    }


    private static void deletePerson() {
        long isForDeleted = inputLong("Axtardigimiz id: ");
        if (deleteById(isForDeleted)) {
            System.out.println("Id-si " + isForDeleted + " olan person silindi");
        } else {
            System.out.println("Id-si " + isForDeleted + " olan person tapilmadi");
        }
    }

    public static boolean deleteById(long id) {
        for (Person person : personList) {
            //eger personun id verilmis id beraberdirse
            if (person.getId() == id) {
                personList.remove(person);
                return true;
            }
        }
        //eger hec biri tapilmadisa false qaytar
        return false;
    }
}
