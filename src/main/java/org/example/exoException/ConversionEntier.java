package org.example.exoException;

import java.util.Scanner;

// 01) Gestion d'une conversion de type incorrecte
// Écrivez un programme Java qui tente de convertir une chaîne de
// caractères saisie par l'utilisateur en entier. Assurez-vous de gérer le
// cas où la chaîne de caractères ne représente pas un entier en traitant
// une exception appropriée.

public class ConversionEntier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre entier :");
        String value = scanner.nextLine();

        try {
            int num = Integer.parseInt(value);
            System.out.println("Vous avez entré :" + num);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : " + value + " est invalide.");
        }
    }
}
