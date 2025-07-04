package org.example;

import org.example.exo2.CarteDeCredit;
import org.example.exo2.Paiement;
import org.example.exo2.PayPal;

public class Main {

    public static void main(String[] args) {
        System.out.println("tests reussite");

        Paiement paiementCarteReussite = new CarteDeCredit("1234567890123456", "Jean Dupont", "12/26", "123");
        String resultCarteReussite = paiementCarteReussite.effectuerPaiement(150.0);
        System.out.println(resultCarteReussite);

        Paiement paiementPaypalReussite = new PayPal("test@test.com", "123456");
        String resultatPaypalReussite = paiementPaypalReussite.effectuerPaiement(75.0);
        System.out.println(resultatPaypalReussite);

        System.out.println("tests echec");

        Paiement paiementCarteEchec = new CarteDeCredit("1234567890123456", "Jean Dupont", "12/26", "123");
        String resultCarteEchec = paiementCarteEchec.effectuerPaiement(- 150.0);
        System.out.println(resultCarteEchec);

        Paiement paiementPaypalEchec = new PayPal("test@test.com", "123456");
        String resultatPaypalEchec = paiementPaypalEchec.effectuerPaiement(0);
        System.out.println(resultatPaypalEchec);
    }

}