package org.example.exo3;

public class Elephant extends Animal {
    private double poids;

    public Elephant(String nom, int age, double poids) {
        super(nom, age);
        this.poids = poids;
    }

    public double getPoids() {
        return poids;
    }


    @Override
    public void manger() {
        System.out.println(nom + " mange des feuilles et des fruits.");
    }

    @Override
    public void dormir() {
        System.out.println(nom + " dort debout.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " barrit !");
    }

    @Override
    public String toString() {
        return nom + " (" + age + " ans, " + poids + " kg)";
    }

}
