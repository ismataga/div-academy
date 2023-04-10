package lesson6.task7;

public class Student extends Person {
    private String username;
    private int enterYear;
    public Student(){

    }

    public Student(String name, String surname, String id, int enterYear) {
        super(name, surname);
        this.username = id;
        this.enterYear = enterYear;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
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
                        "Id: " + getUsername() + "\n" +
                        "EnterYear: " +getEnterYear()+ "\n"
        );
    }
}
