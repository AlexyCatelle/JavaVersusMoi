package org.example.exo2;

public class PayPal implements Paiement {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String effectuerPaiement(double montant) {
        if (montant > 0){
            return "Paiement de " + montant + "€ effectué avec succès par Paypal.";
        } else {
            return "Échec du paiement par Paypal.";
        }
    }
}
