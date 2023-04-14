package lesson8.TasksArrays.task14;

public class Person {
    private String username;
    private String password;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void getInfo() {
        System.out.println("Enter username: " + getUsername() + "\n" +
                "Enter password: " + getPassword());
    }
}