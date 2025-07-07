package org.example.exo3;

//tests

public class Zoo {
    public static void main(String[] args) {

        // Création enclos
        EnclosDesLions enclosLions = new EnclosDesLions();
        EnclosDesElephants enclosElephants = new EnclosDesElephants();


        // Création Lions
        Lion simba = new Lion("Simba", 5);
        Lion nala = new Lion("Nala", 4);

        // Création Elephants
        Elephant dumbo = new Elephant("Dumbo", 10, 1200.0);
        Elephant ella = new Elephant("Ella", 8, 1100.5);

        // Ajout enclos
        enclosLions.ajouterAnimal(simba);
        enclosLions.ajouterAnimal(nala);

        enclosElephants.ajouterAnimal(dumbo);
        enclosElephants.ajouterAnimal(ella);

        // Affichage
        enclosLions.afficherAnimaux();
        simba.dormir();
        enclosElephants.afficherAnimaux();

    }
}
