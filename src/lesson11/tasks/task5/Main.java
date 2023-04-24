package lesson11.tasks.task5;

public class Main {
    public static void main(String[] args) {
        Database d1 = new MySql();
        d1.login();
        d1.add("MySql data");
        d1.delete(1);
        System.out.println(d1.get(2));
        d1.update(1, "newMySql");


        Database d2 = new Oracle();
        d2.login();
        d2.add("Oracle data");
        d2.delete(3);
        System.out.println(d2.get(4));
        d2.update(3, "newOracle");

    }
}
