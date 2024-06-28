import java.util.*;


public class Lists {
    public static void main(String[] args) {
        // List<String> fruits = List.of("Apple", "Guava");
        List<String> fruits = new ArrayList<>();

        // Add : entre la valeur dans la liste

        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Blueberry");
        fruits.add("Pineaplle");
        fruits.add("Watermelon");

        // Remove : retire la valeur de la liste

        // fruits.remove("Apple");
        // fruits.remove(0);

        // Tri des éléments
        Collections.sort(fruits);

        // Remplacer un élément par un autre
        int index = fruits.indexOf("Cherry");
        fruits.set(index, "Banana");
        
        // Recherche spécifique d'élément
        if(fruits.contains("Banana")) {
            System.out.println("Banana is in the list");
        }


        // Présentation des méthode pour faire apparaitre chaque éléments de la liste

        // for(int i = 0; i < fruits.size(); i++) {
        //     System.out.println(fruits.get(i));
        // }

        // for (String fruit : fruits) {
        //     System.out.println(fruit);
        // }

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
