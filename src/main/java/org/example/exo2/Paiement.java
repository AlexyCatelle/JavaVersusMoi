package org.example.exo2;

// 1. **Définir l'interface `Paiement`:**
//   - Méthode `effectuerPaiement(double montant)`: qui accepte un montant
//   et retourne une chaîne indiquant le succès ou l'échec du paiement.

public interface Paiement {
    String effectuerPaiement(double montant);
}
