package Ecercices;

import java.util.*;

public class Exercice2 {
    public static void main(String[] args) {

        List<String> Animals = new ArrayList<>();

        Animals.add("tiger");
        Animals.add("Lion");
        Animals.add("Cat");
        Animals.add("Panther");
        Animals.add("Cheetah");
        Animals.add("Puma");
        Animals.add("Bee");
        Animals.add("Monkey");
        Animals.add("Elephant");

        for (int i = 0; i < Animals.size(); i++ ) {
            System.out.println(Animals.get(i));
        }
        System.out.println("\n");

        Animals.remove("Monkey");
        Animals.remove("Bee");

        Iterator<String> it = Animals.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\n");


        int index = Animals.indexOf("Elephant");
        Animals.set(index, "Jaguar");

        for(String animal : Animals) {
            System.out.println(animal);
        }
        System.out.println("\n");

        if (Animals.contains("Cheetah")){
            System.out.println("Cheetah is in the list");
        }
    }
}
