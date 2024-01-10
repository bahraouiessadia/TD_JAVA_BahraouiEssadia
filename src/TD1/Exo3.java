package TD1;
import java.util.Scanner;
public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire les deux nombres au clavier
        System.out.print("Entrez le premier nombre (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre (b) : ");
        int b = scanner.nextInt();

        // Menu des options
        System.out.println("Choisissez une option :");
        System.out.println("1. Vérifier si la somme a + b est paire");
        System.out.println("2. Vérifier si le produit ab est pair");
        System.out.println("3. Connaître le signe de la somme a + b");
        System.out.println("4. Connaître le signe du produit ab");

        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                verifierSommePaire(a, b);
                break;
            case 2:
                verifierProduitPaire(a, b);
                break;
            case 3:
                connaitreSigneSomme(a, b);
                break;
            case 4:
                connaitreSigneProduit(a, b);
                break;
            default:
                System.out.println("Option invalide");
        }

        scanner.close();
    }

    // Méthode pour vérifier si la somme a + b est paire
    public static void verifierSommePaire(int a, int b) {
        int somme = a + b;
        if (somme % 2 == 0) {
            System.out.println("La somme a + b est paire.");
        } else {
            System.out.println("La somme a + b n'est pas paire.");
        }
    }

    // Méthode pour vérifier si le produit ab est paire
    public static void verifierProduitPaire(int a, int b) {
        int produit = a * b;
        if (produit % 2 == 0) {
            System.out.println("Le produit ab est paire.");
        } else {
            System.out.println("Le produit ab n'est pas paire.");
        }
    }

    // Méthode pour connaître le signe de la somme a + b
    public static void connaitreSigneSomme(int a, int b) {
        int somme = a + b;
        if (somme > 0) {
            System.out.println("La somme a + b est positive.");
        } else if (somme < 0) {
            System.out.println("La somme a + b est négative.");
        } else {
            System.out.println("La somme a + b est égale à zéro.");
        }
    }

    // Méthode pour connaître le signe du produit ab
    public static void connaitreSigneProduit(int a, int b) {
        int produit = a * b;
        if (produit > 0) {
            System.out.println("Le produit ab est positif.");
        } else if (produit < 0) {
            System.out.println("Le produit ab est négatif.");
        } else {
            System.out.println("Le produit ab est égal à zéro.");
        }
    }
}
