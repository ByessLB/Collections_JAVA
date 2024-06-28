package Test;

import java.util.ArrayList;
import java.util.List;

public class demoList {
    public static void afficherListe(String nom, List<String> sousListe) {
        int i = 0;
        for (String element : sousListe) {
            System.out.format("%s %2d : %s\n", nom, i, element);
            i++;
        }
    }

    public static void main(String[] args) {
        List<String> liste = new ArrayList<String>();
        liste.add("1");
        liste.add("2");
        liste.add("3");
        liste.add("4");
        liste.add("5");

        List<String> sousListe = liste.subList(1, 4);
        afficherListe("Sous liste", sousListe);
        System.out.println("");

        sousListe.remove(1);
        afficherListe("Liste", liste);
        System.out.println("");

        afficherListe("sous liste", sousListe);

        System.out.println("");
        liste.remove(1);
        afficherListe("liste", liste);

        afficherListe("sous liste", sousListe);
        System.out.println("");
    }
}
