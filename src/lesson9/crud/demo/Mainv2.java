package lesson9.crud.demo;

import static lesson9.crud.demo.Main.updatePersonById;

import java.util.Scanner;


public class Mainv2 {

    private static Person[] persons;

    private static int count = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massivin olcusunu daxil et  ");
        int n = sc.nextInt();
        persons = new Person[n];
        System.out.println("-------------------");
        createPerson(1l, "Azer", "Quliyev", (byte) 32);
        createPerson(2l, "Fuad", "Bayramov", (byte) 25);
        System.out.println("----------------------");
        readPerson();

        System.out.println("----------------------");
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
        System.out.println("----------------------");
        //id scannerden oxu
        //yeni personun melumatalrinin scannerden daxil edek

        Person newPerson = new Person(sc.nextLong(),//id
            sc.next(),//ad
            sc.next(),//soyad
            sc.nextByte());///yash
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

        long isForDeleted = sc.nextLong();
        if (deletByID(isForDeleted)) {
            System.out.println("Id-si " + isForDeleted + " olan person silindi");
        }

    }

    public static Person createPerson(long id, String name, String surname, byte age) {
        Person p1 = new Person();
        p1.setId(id);
        p1.setName(name);
        p1.setSurname(surname);
        p1.setAge(age);

        persons[count] = p1;
        count++;
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

    public static Person updatePerson(long id, Person newPerson) {
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


    public static boolean deletByID(long id) {
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

