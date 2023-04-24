package lesson11.tasks.task5;

public class MySql implements Database{

    @Override
    public void login() {
        System.out.println("My Sql login");
    }

    @Override
    public void add(String data) {
        System.out.println("MySql add: " + data);

    }

    @Override
    public boolean delete(int id) {
        System.out.println("MySql delete: " + 1);
        return false;
    }

    @Override
    public String get(int id) {
        return "MySql get: " +id;
    }

    @Override
    public void update(int id, String newData) {
        System.out.println("MySql update: " + id+ " with " + newData);

    }
}
