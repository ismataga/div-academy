package lesson6.exampl4;

public class Person {
    private String name;
    private String surname;

    public Person(){

    }
    public Person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname=surname;

    }

    public String getSurname(){
        return surname;
    }


}
