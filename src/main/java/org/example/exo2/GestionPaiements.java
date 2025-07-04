package org.example.exo2;

public class GestionPaiements {
    public static void main(String[] args) {
        //Paiement par Carte de Crédit
        Paiement carte = new CarteDeCredit("1234567890123456", "Alice Martin", "11/25", "321");
        String resultatCarte = carte.effectuerPaiement(150.0);
        System.out.println(resultatCarte);

        //Paiement via PayPal
        Paiement payPal = new PayPal("test@test.com", "123456");
        String resultatPayPal = payPal.effectuerPaiement(75.0);
        System.out.println(resultatPayPal);
    }
}
