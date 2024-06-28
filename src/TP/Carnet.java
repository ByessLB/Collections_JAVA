package TP;

import java.util.*;
public class Carnet {
    private List<Contact> contacts = new ArrayList<>();

    // Vérifier existance contact
    public boolean contactExiste(String email) {
        for (Contact contact : contacts) {
            if (contact.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    // Ajout contact
    public void ajouterContact(Contact contact) {
        if(!contactExiste(contact.getEmail())) {
            contacts.add(contact);
            System.out.println("Contact bien ajouté !");
        } else {
            System.out.println("Ce contact existe déjà !");
        }
    }

    // Modif contact
    public void modifierContact(Contact nouveauContact) {
        String email = nouveauContact.getEmail();
        boolean contactModifie = false;

        if (contactExiste(email)) {
            for (Contact contact : contacts) {
                if (contact.getEmail().equals(email)) {
                    contacts.set(contacts.indexOf(contact), nouveauContact);
                    contactModifie = true;
                    break;
                }
            }
        }

        if (contactModifie) {
            System.out.println("Contact modifié avec succès !");
        } else {
            System.out.println("Erreur : contact non trouvé !");
        }
    }

    // Supprime contact
    public void supprimerContact(String email) {
        Iterator<Contact> iterator = contacts.iterator();
        boolean contactTrouve = false;

        if (contactExiste(email)) {
            while (iterator.hasNext()) {
                Contact contact = iterator.next();
                if (contact.getEmail().equals(email)) {
                    iterator.remove();
                    System.out.println("Le contact a bien été supprimé !");
                    contactTrouve = true;
                    break;
                }
            }
        }

        if (!contactTrouve) {
            System.out.println("Contact non trouvé.");
        }
    }

    // Affiche carnet contacts
    public void afficheCarnet() {
        System.out.println("\nContacts du carnet : ");
        for (Contact contact : contacts) {
            System.out.println("Contact : ");
            contact.displayInfos();
        }
    }

    // Affiche contact
    public void afficheContact(String recherche) {
        boolean contactTrouve = false;

        for (Contact contact : contacts) {
            if (
                contact.getPrenom().equals(recherche) ||
                contact.getNom().equals(recherche) ||
                contact.getEmail().equals(recherche)
                ) {
                    System.out.println("Contact trouvé :");
                    contact.displayInfos();
                    contactTrouve = true;
            }
        }

        if(!contactTrouve) {
            System.out.println("Erreur : contact non trouvé !");
        }
    }

}
