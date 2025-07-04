package org.example.exo2;

public class CarteDeCredit implements Paiement {
    private String numeroCarte;
    private String titulaireCarte;
    private String dateExpiration;
    private String codeCVV;

    // 2. **Créer la classe `CarteDeCredit` qui implémente l'interface `Paiement`:**
    //   - Attributs : numéro de carte, titulaire de la carte, date d'expiration, code CVV.
    //   - Implémentation de la méthode `effectuerPaiement(double montant)`.

    public CarteDeCredit(String numeroCarte, String titulaireCarte, String dateExpiration, String codeCVV) {
        this.numeroCarte = numeroCarte;
        this.titulaireCarte = titulaireCarte;
        this.dateExpiration = dateExpiration;
        this.codeCVV = codeCVV;
    }

    @Override
    public String effectuerPaiement(double montant) {
        if (montant > 0){
            return "Paiement de " + montant + "€ effectué avec succès par carte de crédit.";
        } else {
            return "Échec du paiement par carte de crédit.";
        }
    }
}
