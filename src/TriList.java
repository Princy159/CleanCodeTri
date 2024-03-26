import java.util.List;

public class TriList {

    /**
     Trie une liste d'entiers dans l'ordre croissant.
     */
    public static List<Integer> triCroissant(List<Integer> liste) {

        for (Integer element : liste) {
            if (!(element instanceof Integer)) {
                throw new IllegalArgumentException("La liste doit contenir uniquement des entiers.");
            }
        }

        //  L'algorithme de tri par sélection pour le tri croissant
        for (int i = 0; i < liste.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < liste.size(); j++) {
                if (liste.get(j) < liste.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = liste.get(i);
            liste.set(i, liste.get(minIndex));
            liste.set(minIndex, temp);
        }

        return liste;
    }
}
