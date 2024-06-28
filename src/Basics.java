import java.util.Arrays;

public class Basics {

    public static void main(String[] args) {
        // int[] tab = new int[5];
        int[] tab = {1, 2, 3, 4, 5};
        tab[1] = 7;
        tab[2] = 10;
        tab[4] = 6;
        Arrays.sort(tab); // methode de java.util pour trier
        int position = Arrays.binarySearch(tab,10); // Methode de java.util pour rechercher dans la table selectionné, l'entier de la position donnée
        System.out.println("Position of 10: " + position);

        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        int [][] matrix = new int[3][3];

        matrix[0][0] = 1;
    }
}