package org.example.exo3;

import java.util.ArrayList;
import java.util.List;

public class EnclosDesLions implements Enclos{
    private List<Lion> lions = new ArrayList<>();

    @Override
    public void ajouterAnimal(Animal animal) {
        if (animal instanceof Lion) {
            lions.add((Lion) animal);
        } else {
            System.out.println("Cet animal n'est pas un lion !");
        }
    }

    @Override
    public void afficherAnimaux() {
        System.out.println("Enclos des Lions :");
        for (Lion lion : lions) {
            System.out.println("- " + lion);
        }
    }
}
