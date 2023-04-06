package lesson6.task3;

public class Singer extends Person {
    private String bandName;

    public void sing() {
        System.out.println("singing");
    }

    public void playGuitar() {
        System.out.println("Play guitar");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    @Override
    public void eat() {
        String name = getName();
        System.out.println(name + " eating");

    }

    @Override
    public void learn() {
        String name = getName();
        System.out.println(name + " learning");

    }

    public void doMultipleThings() {
        super.eat();
        super.learn();
        super.walk();
    }

    public void doSomething() {
        this.sing();
        this.playGuitar();
    }
}
