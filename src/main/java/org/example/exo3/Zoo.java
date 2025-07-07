package org.example.exo3;

//tests

public class Zoo {
    public static void main(String[] args) {

        // Création enclos
        EnclosDesLions enclosLions = new EnclosDesLions();


        // Création Lions
        Lion simba = new Lion("Simba", 5);
        Lion nala = new Lion("Nala", 4);

        // Ajout enclos
        enclosLions.ajouterAnimal(simba);
        enclosLions.ajouterAnimal(nala);

        // Affichage
        enclosLions.afficherAnimaux();

    }
}
