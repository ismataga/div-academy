package lesson9.crud.demo;

import java.util.Scanner;

public class Mainv2 {

    private static Person[] persons;

    private static int count = 0;

//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();

    }

    public static int inputInt(String title) {
       try(Scanner inputInt = new Scanner(System.in)) {
           System.out.print(title);
           return inputInt.nextInt();
       }
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
                "1. Enter length of array\n" +
                "2. Create person\n" +
                "3. Read person\n" +
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
                case 1 -> lengthOfArray();
                case 2 -> createPerson();
                case 3 -> readPerson();
                case 4 -> UpdatePerson();
                case 5 -> deleteById(inputLong("Enter id: "));
                default -> System.out.println("Invalid option");
            }
        }
    }

    private static void lengthOfArray() {
        int n = inputInt("Massivin olcusunu daxil et:  ");
        persons = new Person[n];
    }


    private static void deletePerson(Scanner sc) {
        long isForDeleted = sc.nextLong();
        if (deleteById(isForDeleted)) {
            System.out.println("Id-si " + isForDeleted + " olan person silindi");
        } else {
            System.out.println("Id-si " + isForDeleted + " olan person tapilmadi");
        }
    }

    private static void UpdatePerson() {
        Scanner sc = new Scanner(System.in);

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

    private static void findPersonById(Scanner sc) {
        //id scannerden oxu
        System.out.println("Axtardigimiz id: ");
        long id = sc.nextLong();
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

        public static Person createPerson() {
        Person p1 = new Person(inputLong("Enter id: "), inputStr("Enter name: "), inputStr("Enter surname: "), (byte) inputInt("Enter age: "));

        if(persons.length == count){
            Person[] newLength = new Person[persons.length * 2];
            for(int i = 0; i < persons.length; i++){
                newLength[i]=persons[i];
            }
             persons = newLength ;
        }
            persons[count] = p1;
            count++;
            return p1;

    }
//    public static Person createPerson() {
//        Person p1 = new Person(inputLong("Enter id: "), inputStr("Enter name: "), inputStr("Enter surname: "), (byte) inputInt("Enter age: "));
//        if (persons == null) {
//            persons = new Person[1];
//        } else if (count == persons.length) {
//            Person[] newLength = new Person[persons.length * 2];
//
//            for (int i = 0; i < persons.length; i++) {
//                newLength[i] = persons[i];
//            }
//            persons = newLength;
//        }
//        persons[count] = p1;
//        count++;
//        return p1;
//    }


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
                //true qatar
                return true;
            }
        }
        //eger hec biri tapilmadisa false qaytar
        return false;
    }


}

