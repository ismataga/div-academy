package lesson11.tasks.task5;

public class Oracle implements Database {

    @Override
    public void login() {
        System.out.println("Oracle login");
    }

    @Override
    public void add(String data) {
        System.out.println("Oracle add: " + data);
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Oracle delete: " + id);
        return false;
    }

    @Override
    public String get(int id) {
        return "Oracle get: " + id;
    }

    @Override
    public void update(int id, String newData) {
        System.out.println("Oracle update: " + id + " with " +newData);
    }
}
