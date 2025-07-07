package org.example.exoException;

import java.util.Scanner;

// 02) Racine Carre
// Écrivez un programme Java qui demande à l'utilisateur de saisir un nombre entier
// positif et calcule sa racine carrée. Le programme doit gérer les exceptions pour les
// cas où l'utilisateur saisit un nombre négatif ou entre une entrée non numérique.
// Votre tâche consiste à implémenter la logique nécessaire pour gérer ces situations
// exceptionnelles en utilisant les mécanismes appropriés de gestion des exceptions en Java
// Pour calcule la racine carre nous utiliserons Math.sqrt

//  Bonus :
// Le programme demandera à nouveau à l'utilisateur de saisir un nombre s'il entre
// une valeur incorrecte.
public class RacineCarree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;

        while (!validValue) {
            System.out.print("Entrez un nombre entier positif : ");
            String value = scanner.nextLine();

            try {
               int num = Integer.parseInt(value);
               if (num < 0){
                   throw new IllegalArgumentException("Le nombre doit être positif.");
               }

               double racine = Math.sqrt(num);
               System.out.println("La racine carrée de " + num + " est : " + racine +" .");
               validValue = true;
            } catch (NumberFormatException e) {
                System.out.println("Erreur : '" + value + "' n'est pas valide.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }
}
