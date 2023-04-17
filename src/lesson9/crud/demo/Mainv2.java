//package lesson9.crud.demo;
//
//import java.util.Scanner;
//
//
//public class Mainv2 {
//    private static Person[] persons;
//
//    private static int count = 0;
//
//    public static void main(String[] args) {
//        inputArraySize();
//        showMenu();
//
//    }
//
//    public static void inputArraySize() {
//        int n = inputInt("Enter array's size: ");
//        persons = new Person[n];
//    }
//
//    public static int inputInt(String title) {
//        try (Scanner inputInt = new Scanner(System.in)) {
//            System.out.print(title);
//            return inputInt.nextInt();
//        }
//    }
//
//    public static long inputLong(String title) {
//        try (Scanner inputLong = new Scanner(System.in)) {
//            System.out.print(title);
//            return inputLong.nextInt();
//        }
//    }
//
//    public static String inputStr(String title) {
//        Scanner inputStr = new Scanner(System.in);
//        System.out.print(title);
//        return inputStr.nextLine();
//    }
//
//
//    public static Person getPersonById(long id) {
//
//        for (int i = 0; i < count; i++) {
//            if (persons[i].getId() == id) {
//                return persons[i];
//            }
//        }
//        return null;
//    }
//
//    public static void getPersonByIdShow() {
//        Person person = getPersonById(inputInt("enter id"));
//        if (person == null) {
//            System.out.println("Id-si " + inputLong("enter id") + " olan Person yoxdur");
//        } else {
//            System.out.println(person);
//        }
//    }
//
//    public static Person createPerson(long id, String name, String surname, byte age) {
//        Person person = new Person();
//        person.setId(12);
//        person.setName("Aqil");
//        person.setSurname("Agayev");
//        person.setAge((byte) 12);
//
//
//        for (Person currPerson : persons) {
//            if (currPerson != null) {
//                if (currPerson.getId() == id) {
//                    System.out.println("Id already exist.");
//                }
//            }
//        }
//        persons[count] = person;
//        count++;
//        return person;
//    }
//
//
//    private static Person inputPersonData() {
//        return new Person(inputInt("Enter id: "), inputStr("Enter name: "), inputStr("Enter surname: "), (byte) inputInt("Enter age: "));
//    }
//
//
//    public static void printCommand() {
//        System.out.println("" +
//                "----|Enter menu|----");
//        System.out.println("0. Exit system\n" +
//                "1. Create person\n" +
//                "2. Show person\n" +
//                "3. Update person\n" +
//                "4. Get persons by id\n" +
//                "4. Delete person\n"
//        );
//
//    }
//
//    public static void showMenu() {
//
//        while (true) {
//            printCommand();
//
//            int option = inputInt("Enter option: ");
//
//            switch (option) {
//                case 0 -> {
//                    return;
//                }
////                case 1 -> createPerson(inputPersonData());
//                case 2 -> showPerson();
////                case 3 -> updatePersonById();
//                case 4 -> getPersonByIdShow();
//                case 5 -> deletePerson(inputInt("Enter id: "));
//                default -> System.out.println("Invalid option");
//            }
//        }
//    }
//
//    public static void showPerson() {
//        for (int i = 0; i < count; i++) {
//            System.out.println(persons[i]);
//        }
//    }
//
//    //    public static Person updatePersonById( long id, Person newPerson) {
////        Person person = getPersonById(inputLong("Enter id: "));
////        if (person != null) {
////            person.setName(inputStr("Enter name: "));
////            person.setSurname(inputStr("Enter surname: "));
////            person.setAge((byte) inputInt("Enter age: "));
////            return person;
////        }else {
////            return null;
////        }
////    }
//    public static Person updatePersonById(long id, Person newPerson) {
//        Person person = getPersonById(id);
//        if (person != null) {
//            person.setName(newPerson.getName());
//            person.setSurname(newPerson.getSurname());
//            person.setAge(newPerson.getAge());
//            return person;
//        } else {
//            return null;
//        }
//    }
//
//    public static void printUpdatePerson() {
//        Long id = inputLong("Enter id");
////        Person newPerson = new Person(inputPersonData());
//        Person newPerson = new Person();
//        Person updatePerson = updatePersonById(newPerson.getId(), newPerson);
//
//        if (updatePerson == null) {
//            System.out.println("Hec bir person deyisdirilmedi");
//        } else {
//            System.out.println(updatePerson);
//        }
//    }
//
//    public static void deletePerson(int id) {
//        boolean isDeleted = false;
//        for (int i = 0; i < count; i++) {
//            if (persons[i] != null) {
//                if (persons[i].getId() == id) {
//                    persons[i] = null;
//                    isDeleted = true;
//                    count--;
//                }
//            }
//            if (isDeleted) {
//                if (persons.length - 1 != i) {
//                    persons[i] = persons[i + 1];
//                    persons[i + 1] = null;
//                }
//            }
//        }
//        if (!isDeleted) {
//            System.out.println("User not found by id: " + id);
//        } else {
//            System.out.println("User deleted successfully!");
//        }
//
//    }
//}
//
