package Ecercices;

import java.util.HashMap;
import java.util.Map;

public class Exercice4 {

    public static void wiki(Map<String, String> map) {
        System.out.println("\n Voici les définition : \n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Map<String, String> Dico = new HashMap<>();
        Dico.put("String", "Chaîne de caractère");
        Dico.put("Integer", "Nombre entier");
        Dico.put("Double", "Nombre suivi de décimal");
        Dico.put("Boolean", "Valeur vrai ou fausse");
        Dico.put("Float", "Similaire à 'Double'");

        wiki(Dico);
    }
}
