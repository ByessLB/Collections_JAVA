import java.util.*;

public class Maps {
    
    public static void main(String[] args) {


        // Création d'une nouvelle map
        // Ici l'initialisation et l'intégration se déterminent différemment : "Map<>()" et new "HashMap<>()"
        Map<String, Integer> courses = new HashMap<>();
        // Utilisation de ".put" pour intégrer les éléments à la "Map"
        courses.put("Physics", 6);
        courses.put("English", 4);
        courses.put("Math", 8);
        courses.put("Sport", 3);
        courses.put("Economics", 4);
        // Ici, en insérant un nouvelle élément avec une même "key", en permet la modification de la "value"
        courses.put("Economics", 7);

        // Permet de déterminer la taille de la Map
        System.out.println(courses.size());

        // Lorsque l'on souhaite avoir la valeur d'un seul élément
        System.out.println(courses.get("Math"));

        // Ici nous appelons toute les "key" : avec ".keySet()"
        // for (String key : courses.keySet()) {
        //     System.out.println(key);
        // }

        // Ici nous appelons toute les "values" : avec ".values()"
        // for (int value : courses.values()) {
        //     System.out.println(value);
        // }

        // Pour pouvoir appeler en une fois la "key" et la "value" nous utilisont : ".entrySet()"
        for (Map.Entry<String,Integer> entry : courses.entrySet()) {
            // avec ".entrySet()", récupérez la key avec : ".getKey()" et la valeur avec : ".getValue()"
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
