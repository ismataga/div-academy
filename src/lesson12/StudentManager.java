package lesson12;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentInterface{

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1,"Aqil", 19));
        students.add(new Student(2,"Zaur", 52));
        students.add(new Student(3,"Eli", 15));
        students.add(new Student(4,"Adil", 24));
    }
    @Override
    public Student getById(int id) {
        students.get(id);
        return students.get(id-1);
    }

    @Override
    public void SaveStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
