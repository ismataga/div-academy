package lesson8.StudentManagmentSystem;

import lesson8.StudentManagmentSystem.globa.Global;
import lesson8.StudentManagmentSystem.util.Util;

public class StudentService {

    public void showMenu(){
        System.out.println("0. Exit System" +"\n"+
                "1. Show all student" + "\n"+
                "2. Register student" + "\n" +
                "3. Update student" +"\n"+
                "4. Remove Student");

    }
    public Student fillstudent(){
       String name =  Util.recallStr("Enter student count");
       String  surname =  Util.recallStr("Enter surname");
       int id = Util.recallInt("Enter id");
       String profession = Util.recallStr("Enter profesion");
       return new Student(name,surname, id, profession);

    }

    public void registStudent(){

        for (int i = 0; i<Global.users.length; i++){
            Global.users[i] = fillstudent();
        }

    }
}
