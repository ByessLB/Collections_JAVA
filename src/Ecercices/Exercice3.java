package Ecercices;

import java.util.*;

public class Exercice3 {

    public static void main(String[] args) {
        // Intégration du scanner pour prévoir l'entré de donnée par un utilisateur (console)
        Scanner scan = new Scanner(System.in);
        // Création d'une liste qui recevra les données de l'utilisateur
        List<Integer> List = new ArrayList<>();

        System.out.println("Veuillez entrée 5 entiers : ");

        // Création d'une boucle for pour déterminé le nombre d'entier que recevra la liste (ici 5)
        for (int i = 0; i < 5; i++) {
            // Initialisation d'une condition : si je reçoi les données de l'utilisateur
            if (scan.hasNextInt()) {
                // Insertion de la données dans une variable
                int number = scan.nextInt();
                // Introduction de la variable dans la liste
                List.add(number);
            } else {
                System.out.println("Erreur : vous devez entrer un entier");
                // En réduit le compteur si l'entrée n'est pas un entier
                i--;
            }
        }

        // Initialisation de l'interface Set
        // Instauration de TreeSet<>() pour mettre en ordre croissant
        Set<Integer> numbers = new TreeSet<>();
        numbers.addAll(List);

            System.out.println("La liste d'entiers est : " + numbers);
            // for (int num : numbers) {
            //     System.out.println(num);
            // }
            scan.close();
    }
}