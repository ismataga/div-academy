package lesson11.tasks.task4;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Toplan");
        Animal myCat = new Cat("Tom");

        System.out.println(myDog.getName() + " says " + myDog.makeNoise());
        System.out.println(myCat.getName() + " says " + myCat.makeNoise());
    }
}
