package TD1;
import java.util.Scanner;
public class Exo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir la taille des matrices carrées
        System.out.print("Entrez la taille des matrices carrées (n) : ");
        int n = scanner.nextInt();

        // Saisir la première matrice
        System.out.println("Saisissez les éléments de la première matrice :");
        double[][] matrice1 = saisirMatrice(n);

        // Saisir la deuxième matrice
        System.out.println("Saisissez les éléments de la deuxième matrice :");
        double[][] matrice2 = saisirMatrice(n);

        // Calculer la somme des matrices
        double[][] sommeMatrices = calculerSommeMatrices(matrice1, matrice2);

        // Afficher le résultat
        System.out.println("La somme des deux matrices est :");
        afficherMatrice(sommeMatrices);

        scanner.close();
    }

    // Méthode pour saisir une matrice
    public static double[][] saisirMatrice(int n) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrice = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element à la position (" + (i + 1) + ", " + (j + 1) + ") : ");
                matrice[i][j] = scanner.nextDouble();
            }
        }

        return matrice;
    }

    // Méthode pour calculer la somme de deux matrices
    public static double[][] calculerSommeMatrices(double[][] matrice1, double[][] matrice2) {
        int n = matrice1.length;
        double[][] sommeMatrices = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return sommeMatrices;
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(double[][] matrice) {
        int n = matrice.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
