import java.util.*;

public class Sets {
    public static void main(String[] args) {

        Set<String> cars = new TreeSet<>();
        // TreeSet permet de trié dans l'ordre alphabetique
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Audi");
        cars.add("Land Rover");
        cars.add("Toyota");

        // Creation d'un nouveau Set
        Set<String> others = Set.of("Nissan", "Toyota");
        // En implémente le nouveau set dans "cars" (.addAll)
        cars.addAll(others);

        for(String car : cars) {
            System.out.println(car);
        }

        List<Integer> numbers = List.of(5, 1, 9, 4, 3, 7, 4, 5);
        Set<Integer> set = new TreeSet<>();
        set.addAll(numbers);

        for (int num : set) {
            System.out.println(num);
        }

        // Opération teste

        // cars.add("Micra");
        // cars.add("206");
        // cars.add("Punto");

        // for(String car : cars) {
        //     System.out.println(car);
        // }
        // System.out.println("\n");

        // cars.remove("Micra");
        // cars.remove("206");
        // cars.remove("Punto");

    }
}
