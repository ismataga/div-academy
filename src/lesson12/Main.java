package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.getById(2));
        System.out.println(studentManager.getAll());
        studentManager.SaveStudent(new Student(5,"Amil",25));
        System.out.println(studentManager.getAll());


    }

    private static void renglerCapET() {
        List<String> rengler = new ArrayList<>();
        rengler.add("ag");
        rengler.add("qara");
        rengler.add("sari");
        rengler.add("yasil");


        //1.
        for (String reng: rengler) {
            System.out.println(reng);
        }

        //2.
        System.out.println(rengler.get(1));

        //3.
        if (rengler.isEmpty()){
            System.out.println("list is empty");
        }else{
            System.out.println("List has " + rengler.size() + "elements");
        }

        //4
        List<String> renglerLinked = new LinkedList<>();

        renglerLinked.add("ag");
        renglerLinked.add("qara");
        renglerLinked.add("sari");
        renglerLinked.add("yasil");

        if (renglerLinked.isEmpty()){
            System.out.println("list is empty");
        }else{
            System.out.println("List has " + renglerLinked.size() + "elements");
        }

        //5.
        System.out.println(renglerLinked.get(1));

        //6
        renglerLinked.remove(3);

        PriorityQueue<String> renglerQueue = new PriorityQueue<>();

        renglerQueue.add("ag");
        renglerQueue.add("qara");
        renglerQueue.add("sari");
        renglerQueue.add("yasil");
        //7
        renglerQueue.size();




    }
}
