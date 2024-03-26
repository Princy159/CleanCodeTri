import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> liste = new ArrayList<>();

        try {
            System.out.print("Entrez le nombre d'éléments à trier : ");
            int n = scanner.nextInt();

            System.out.println("Entrez les " + n + " nombres à trier :");
            for (int i = 0; i < n; i++) {
                liste.add(scanner.nextInt());
            }

            List<Integer> listeTriee = TriList.triCroissant(liste);
            System.out.println("Liste triée croissante : " + listeTriee);
        } catch (InputMismatchException e) {
            System.out.println("Erreur: Veuillez entrer des nombres entiers.");
        } catch (IllegalArgumentException e) {
            if (e.getMessage().equals("La liste est vide.")) {
                System.out.println("Erreur: La liste est vide.");
            } else {
                System.out.println("Erreur: La liste doit contenir uniquement des entiers.");
            }
        } finally {
            scanner.close();
        }
    }
}
