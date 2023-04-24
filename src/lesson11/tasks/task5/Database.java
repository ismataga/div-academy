package lesson11.tasks.task5;

public interface Database {
    void login();

    void add(String data);

    boolean delete(int id);

    String get(int id);

    void update(int id,String newData);
}
