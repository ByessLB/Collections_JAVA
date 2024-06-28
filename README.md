## Les Collections en JAVA

Les collections en java sont des structures de données qui permettent de stocker, manipuler et organiser des éléments. Elles sont essentielles pour gérer des groupes de manière efficace. Voici quelques points clés à connaître :

### Introduction aux Collections

- Une collection (parfois appelée conteneur) est simplement un objet qui regroupe plusieurs éléments en une seule unité.
- Les collections sont utilisées pour srtocker, récuprérer, manipuler et communiquer des données agrégées.
- le Framework des Collection Java fournit des interfaces, des implémentations et des algorithmes pour travailler avec des Collections.

### Structure des dossiers

Le dossier `src`, regroupe 3 sous dossier ainsi que les fichiers permettant la conpréhension des interfaces du framework :

- `src/Exercices` : Exercice de compréhension des Collecitons
- `src/Test` : Autre exercice de compréhension
- `src/TP` : Création d'un carnet d'adresse
- `src/Basics.java` : Les "arrays"
- `src/Lists.java` : Les Lists
- `src/Maps.java` : Les Maps
- `src/Sets.java` : Les Sets

## Interfaces de Base

Les interfaces de base du Framework des Collections java sont les suivantes :

- `Collection` : L'interface racine de la hiérarchie des collections. elle représente un groupe d'objets (éléments) et définit des méthodes pour ajouter, supprimer, rechercher et parcourir ces éléments.
- `List` : Une collection ordonnée qui peut contenir des doublons. Les éléments sont accessibles par leur position (index). Exemple : `ArrayList`, `LinkedList`.
- `Set` : Une collection qui ne permet pas de doublons. Les éléments n'ont pas d'ordre spécifique. Exemples : `HashSet`, `TreeSet`.
- `Map` : Une collection associant des clés à des valeurs (paires clé-valeur). Chaque clé est unique. Exemples : `HashMap`, `TreeMap`.

## Création de Tableaux Simples

En java, vous pouvez créer un tableau simple (unidimensionnel) comme suit :

```java
int[] tableauEntiers = new int[5]; // Crée un tableau d'entiers de taille 5
tableauEntiers[0] = 10; // Affecte la valeur 10 à la première case
// ... Ajoutez d'autres éléments au tableau
```

## Utilisation des Lits

Les `Lists` sont des collections ordonnées qui permettent d'acc&éder aux éléments par leur index. Voici comment utiliser une `ArrayList` :

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listeNoms = new ArrayList<>();
        listeNoms.add("Alice");
        listeNoms.add("Bob");
        listeNoms.add("Charlie");

        System.out.println(listeNoms.get(1)) // Affiche "Bob"
    }
}
```

## Utilisation des Sets

 Les `Sets` sont des collections sans doublons. Voici comment utiliser un `HashSet` :

 ```java
 import java.util.HashSet;
 import java.util.Set;

 public class Main {
    public static void main(String[] args) {
        Set<Integer> ensemble = new HasSet<>();
        ensemble.add(10);
        ensemble.add(20);
        ensemble.add(10); // Ignoré car déjà présent

        System.out.println(ensemble); // Affiche "[10, 20]"
    }
 }
 ```

 ## Utilisation des Maps

 Les `Maps` associent des clés à des valeurs. Voici comment utiliser une `HashMap` :

 ```java
 import java.util.HashMap;
 import java.util.Map;

 public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 100);
        scores.put("Bob", 85);
        scores.put("Charlie", 82);

        System.out.println(scores.get("Bob")). // Affiche "85"
    }
 }
 ```"# Collections_JAVA" 
