package TD1;
import java.util.Scanner;
public class Exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Saisir les éléments du tableau
        char[] tableau = new char[taille];
        System.out.println("Saisissez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément à la position " + (i + 1) + " : ");
            tableau[i] = scanner.next().charAt(0);
        }

        // Effectuer le décalage des éléments
        deplacerElements(tableau);

        // Afficher le tableau modifié
        System.out.println("Tableau modifié :");
        afficherTableau(tableau);

        scanner.close();
    }

    // Méthode pour effectuer le décalage des éléments d'un tableau
    public static void deplacerElements(char[] tableau) {
        char temp = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            tableau[i - 1] = tableau[i];
        }
        tableau[tableau.length - 1] = temp;
    }

    // Méthode pour afficher un tableau
    public static void afficherTableau(char[] tableau) {
        for (char element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
