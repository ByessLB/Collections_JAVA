package Ecercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {

        int[] tab = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez 10 valeurs entières :");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
            }
        Arrays.sort(tab);
        
        System.out.println("Les valeurs entières sont :");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        scanner.close();
    }
}
