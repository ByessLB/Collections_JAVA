package TP;

public class App {
    public static void main(String[] args) {

        Contact first = new Contact("doe", "john", "0606060606", "johnDoe@mail.com");
        Contact second = new Contact("doe", "jane", "0707070707", "janeDoe@mail.com");
        Contact third = new Contact("Le boul", "maui", "0606555231", "mlb@mail.com");
        Contact forth = new Contact("Le Boulicaut", "Johanna", "0123456789", "jlb@mail.com");

        Contact modif = new Contact("Le Boulicaut", "Maui", "0606555321", "mlb@mail.com");

        Carnet carnet = new Carnet();
        carnet.ajouterContact(first);
        carnet.ajouterContact(second);
        carnet.ajouterContact(third);
        carnet.ajouterContact(forth);
        carnet.afficheCarnet();

        carnet.modifierContact(modif);
        carnet.afficheContact("mlb@mail.com");

        carnet.afficheCarnet();

        carnet.supprimerContact("janeDoe@mail.com");

        carnet.afficheCarnet();

        carnet.afficheContact("Le Boulicaut");
    }
}
