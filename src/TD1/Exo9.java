package TD1;
import java.util.Scanner;
public class Exo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un entier naturel N
        System.out.print("Entrez un entier naturel N : ");
        int N = scanner.nextInt();

        // Vérifier que N est un entier naturel
        if (N < 0) {
            System.out.println("N doit être un entier naturel.");
        } else {
            // Calculer et afficher le factoriel de N
            long factoriel = calculerFactoriel(N);
            System.out.println(N + "! = " + factoriel);
        }

        scanner.close();
    }

    // Méthode pour calculer le factoriel de N
    public static long calculerFactoriel(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            long resultat = 1;
            for (int i = 2; i <= N; i++) {
                resultat *= i;
            }
            return resultat;
        }
    }
}
