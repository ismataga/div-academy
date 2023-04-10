package lesson8.StudentManagmentSystem;

public class Student extends Person {
    private int id;
    private String profession;
    public Student(String name, String profession,int id , String surname ) {
        super(name, surname);
        this.id = id;
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    public void getInfo() {
        System.out.println("Student{" +"name" + getName()+"\n"+
                "surname"+getSurname()+"\n"+
                "id=" + id +
                ", profession='" + profession + '\'' +

                '}');
    }
}
