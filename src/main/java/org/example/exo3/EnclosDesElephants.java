package org.example.exo3;

import java.util.ArrayList;
import java.util.List;

public class EnclosDesElephants implements Enclos {
private List<Elephant> elephants = new ArrayList<>();

    @Override
    public void ajouterAnimal(Animal animal) {
        if (animal instanceof Elephant) {
            elephants.add((Elephant) animal);
        } else {
            System.out.println("Cet animal n'est pas un éléphant !");
        }
    }

    @Override
    public void afficherAnimaux() {
        System.out.println("Enclos des Éléphants :");
        for (Elephant elephant : elephants) {
            System.out.println("- " + elephant);
        }
    }
}
