package lesson10;

public class Person {
    private long id;
    private String name;

    private byte age;
    private  String subject;
    private double experience;


    public Person(long id, String name, byte age,String subject,double experience) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.experience = experience;
    }

    public Person() {

    }





    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public Person(lesson9.crud.demo.Person data) {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", experience=" + experience +
                '}';
    }
}
