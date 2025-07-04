package org.example.exo1;

public abstract class Salarie {

    protected String matricule;
    protected String service;
    protected String categorie;
    protected String nom;
    protected Double salaire;

    protected static int nombreEmployes = 0;
    protected static double salaireTotal = 0;

    // Constructeur principal
    public Salarie(String matricule, String service, String categorie, String nom, Double salaire) {
        this.matricule = matricule;
        this.service = service;
        this.categorie = categorie;
        this.nom = nom;
        this.salaire = salaire;

        nombreEmployes++;
        salaireTotal += salaire;
    }

    // ✅ Constructeur vide (ajouté)
    public Salarie() {
        this.matricule = "";
        this.service = "";
        this.categorie = "";
        this.nom = "";
        this.salaire = 0.0;
    }

    // Méthode à surcharger dans les classes dérivées
    public abstract void afficherSalaire();

    // Getters
    public String getMatricule() {
        return matricule;
    }

    public String getService() {
        return service;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getNom() {
        return nom;
    }

    public double getSalaire() {
        return salaire;
    }

    // Méthodes statiques
    public static int getNombreEmployes() {
        return nombreEmployes;
    }

    public static double getSalaireTotal() {
        return salaireTotal;
    }

    public static void resetNombreEmployes() {
        nombreEmployes = 0;
        salaireTotal = 0;
    }
}
