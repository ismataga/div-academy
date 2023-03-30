package lesson5.tasks.task1.task3;

public class Student {
    String name;
    String surname;
    String unversity;
    int age;
    int entrYear;

    public String getName() {
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getUnversity(){
        return unversity;
    }

    public int getAge() {
        return age;
    }
    public int getEntrYear(){
        return entrYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUnversity(String unversity) {
        this.unversity = unversity;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEntrYear(int entrYear) {
        this.entrYear = entrYear;
    }

    public void getInfo(String name, String surname, String unversity, int age, int entrYear){
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("university: " + unversity);
        System.out.println("age: " + age);
        System.out.println("enterYear: " + entrYear);
    }
}
