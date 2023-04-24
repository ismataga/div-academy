package lesson11.tasks.task4;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeNoise() {
        return "Bark!";
    }
}
