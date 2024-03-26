import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liste = new ArrayList<>();

        try {
            System.out.println("Entrez les nombres à trier, puis appuyez sur Entrée pour terminer :");
            String input = scanner.nextLine();

            // Analyse de la saisie de l'utilisateur
            String[] numbers = input.split(",");
            for (String number : numbers) {
                liste.add(Integer.parseInt(number.trim()));
            }

            Collections.sort(liste);

            System.out.println("Liste triée : " + liste);

        } catch (NumberFormatException e) {
            System.out.println("Erreur: Veuillez réessayer et entrer des nombres valides.");
        } finally {
            scanner.close();
        }
    }
}
