package TD1;
import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire les valeurs de a, b et c au clavier
        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        // Résoudre l'équation quadratique
        resoudreEquationQuadratique(a, b, c);

        scanner.close();
    }

    // Méthode pour résoudre l'équation quadratique
    public static void resoudreEquationQuadratique(double a, double b, double c) {
        // Calcul du discriminant
        double discriminant = b * b - 4 * a * c;

        // Vérifier le signe du discriminant
        if (discriminant > 0) {
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Deux racines réelles distinctes : racine1 = " + racine1 + ", racine2 = " + racine2);
        } else if (discriminant == 0) {
            double racine = -b / (2 * a);
            System.out.println("Une racine réelle double : racine = " + racine);
        } else {
            System.out.println("Aucune racine réelle, les racines sont complexes.");
            double partieReelle = -b / (2 * a);
            double partieImaginaire = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Racine 1 : " + partieReelle + " + " + partieImaginaire + "i");
            System.out.println("Racine 2 : " + partieReelle + " - " + partieImaginaire + "i");
        }
    }
}
