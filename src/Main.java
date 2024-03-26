import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liste = new ArrayList<>();

        try {
            System.out.println("Entrez des nombres séparer par des virgules, puis appuyez sur Entrée pour terminer :");
            String input = scanner.nextLine();

            // Analyse de la saisie de l'utilisateur
            String[] numbers = input.split(",");
            for (String number : numbers) {
                liste.add(Integer.parseInt(number.trim()));//Convertit chaque élément en entier en supprimant les espaces et l'ajoute à la liste .
            }

            //Trie la liste liste dans l'ordre croissant
            Collections.sort(liste);

            System.out.println("Liste triée : " + liste);

        } catch (NumberFormatException e) {
            System.out.println("Erreur: Veuillez réessayer et entrer des nombres valides.");
        } finally {
            scanner.close();
        }
    }
}
