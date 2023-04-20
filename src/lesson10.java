import lesson9.crud.demo.Person;

public class lesson10 {
    public static void main(String[] args) {

        Person person1= new Person(1L, "Aqil", (byte) 25,"Backend",5.5);
        Person person = new Person();
            person.getId();
            person.getName();
            person.getAge();
            person.getSubject();
            person.getExperience();


        System.out.println(person);
    }
}
