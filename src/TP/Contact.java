package TP;

public class Contact {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    // Constructor
    public Contact(String nom, String prenom, String telephone, String email) {
        this.nom = nom; 
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    // Getters & Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Afficher les informations
    public void displayInfos() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Telephone : " + this.telephone);
        System.out.println("Email : " + this.email + "\n");
    }

    @Override
    public String toString() {
        return "Contact [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email + "]";
    }

    
}
