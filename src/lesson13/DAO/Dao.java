package lesson13.DAO;

import lesson13.Exception.NotCorrectUser;
import lesson13.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dao {
    public static void main(String[] args) throws NotCorrectUser {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        User user = new User(age, name);
        addUser(user);
    }

    private static void addUser(User user) throws NotCorrectUser {
        List<User> users = new ArrayList<>();
        if (user.getAge() < 65) {
            throw new NotCorrectUser("Yas 65 den kicikdir");
        } else {
            users.add(user);
        }
    }
}
