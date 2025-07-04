package org.example.exo1;

//  Créer une classe Commercial en dérivant la classe Salarie de l'exercice Salarié.
public class Commercial extends Salarie {
// Cette classe aura 2 propriétés supplémentaires pour calculer un montant de commission :
// chiffre d’affaire et commission en %.
// Créer les deux constructeurs de la classe Commercial.

    private double chiffreAffaire;
    private double commissionPourcentage;

    // Ne pas oublier d'appeler les constructeurs équivalents e la classe de base (mère).
    public Commercial(String matricule, String service, String categorie, String nom, Double salaire, double chiffreAffaire, double commissionPourcentage) {
        super(matricule, service, categorie, nom, salaire);
        this.chiffreAffaire = chiffreAffaire;
        this.commissionPourcentage = commissionPourcentage;
    }

    // Surcharger la méthode AfficherSalaire() pour calculer le salaire réel (fixe + commission).
    @Override
    public void afficherSalaire(){
        double commission = chiffreAffaire * commissionPourcentage / 100;
        double salaireWiCommission = getSalaire() + commission;

        System.out.println("Nom: " + getNom() +
                ", Salaire fixe: " + getSalaire() + " €" +
                ", Commission: " + commission + " €" +
                ", Salaire total: " + salaireTotal + " €");

}

    // Ajoutez des méthodes ToString pour l'affichage des salariés et commerciaux.

    @Override
    public String toString() {
        return "Commercial {" +
                "Nom='" + getNom() + '\'' +
                ", Matricule='" + getMatricule() + '\'' +
                ", Service='" + getService() + '\'' +
                ", Catégorie='" + getCategorie() + '\'' +
                ", Salaire fixe=" + getSalaire() +
                ", Chiffre d'affaire=" + chiffreAffaire +
                ", Commission (%)=" + commissionPourcentage +
                '}';
    }
}


