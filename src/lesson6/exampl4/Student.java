package lesson6.exampl4;

public class Student extends Person {
    private String id;
    private int enterYear;

    public Student(String name, String surname, String id, int enterYear) {
        super(name, surname);
        this.id = id;
        this.enterYear = enterYear;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEnterYear(int enterYear) {
        this.enterYear = enterYear;
    }

    public int getEnterYear() {
        return enterYear;
    }

    public void getInfo() {
        System.out.println(
                "Name:" + getName() + "\n" +
                        "Surname: " + getSurname() + "\n" +
                        "Id: " + getId() + "\n" +
                        "EnterYear: " +getEnterYear()+ "\n"
        );
    }
}
