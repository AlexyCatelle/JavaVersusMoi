package org.example.exo3;

public class Lion extends Animal {
   public Lion(String nom, int age) {
       super(nom, age);
   }
    @Override
    public void manger() {
        System.out.println(nom + " mange de la viande.");
    }

    @Override
    public void dormir() {
        System.out.println(nom + " dort dans la savane.");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " rugit !");
    }
}
