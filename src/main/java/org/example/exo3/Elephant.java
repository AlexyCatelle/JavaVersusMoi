package org.example.exo3;

public abstract class Elephant extends Animal {
    private double poids;

    public Elephant(String nom, int age, double poids) {
        super(nom, age);
        this.poids = poids;
    }

    public double getPoids() {
        return poids;
    }
}
