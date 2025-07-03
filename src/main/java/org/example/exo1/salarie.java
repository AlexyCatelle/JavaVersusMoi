package org.example.exo1;
// 1. Créer une classe Salarié ayant pour attributs :
// le matricule, le service, la catégorie, le nom et le salaire de l’employé

public class Salarie {

    private String matricule;
    private String service;
    private String categorie;
    private String nom;
    private Double salaire;

    public Salarie(String matricule, String service, String categorie, String nom, Double salaire) {
        this.matricule = matricule;
        this.service = service;
        this.categorie = categorie;
        this.nom = nom;
        this.salaire = salaire;

        nombreEmployes++;
        salaireTotal += salaire;
    }
    // 2. Cette classe aura également comme méthode AfficherSalaire()

    public void AfficherSalaire() {
        system.out.println("Nom :" + nom ", Salaire: " + salaire + " €");
    }

    //  3. Cette classe pourra, via deux champs et une méthode,
    // permettre de savoir le nombre total d’employés,
    // le salaire total
    // et remettre à zéro la valeur du nombre d’employés dans l’entreprise

    public static int getNombreEmployes() {
        return nombreEmployes;
    }

    public static void resetNombreEmployes() {
        nombreEmployes = 0;
        salaireTotal = 0;
    }
}
