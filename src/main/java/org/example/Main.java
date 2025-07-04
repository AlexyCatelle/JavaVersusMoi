package org.example;

import org.example.exo1.Commercial;
import org.example.exo1.Salarie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // --- Création de commerciaux ---
        Commercial c1 = new Commercial("C001", "Ventes", "C", "Charlie", 2000., 15000, 5);
        Commercial c2 = new Commercial("C002", "Ventes", "D", "Diane", 2200., 20000, 7);

        System.out.println("\n=== Affichage des Commerciaux ===");
        c1.afficherSalaire();
        c2.afficherSalaire();

        // --- Affichage via toString() ---
        System.out.println("\n=== toString() ===");
        System.out.println(c1);
        System.out.println(c2);


    }
}