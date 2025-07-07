package org.example.exo3;

//1. **Définir la classe abstract Animal:**
//   - Méthode manger(): qui ne retourne rien et simule l'action de manger.
//   - Méthode dormir(): qui ne retourne rien et simule l'action de dormir.
//   - Méthode faireDuBruit(): qui ne retourne rien et simule l'action de faire du bruit.

public abstract class Animal {
protected String nom;
protected int age;

// Constructeur
public Animal(String nom, int age) {
    this.nom = nom;
    this.age = age;
}

// Methodes
public abstract void manger();
public abstract void dormir();
public abstract void faireDuBruit();

// Getter
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    // Affichage String
    @Override
    public String toString() {
        return nom + " (" + age + " ans)";
    }
}

