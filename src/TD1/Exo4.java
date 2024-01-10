package TD1;
import java.util.Scanner;
public class Exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire la moyenne de l'étudiant
        System.out.print("Entrez la moyenne de l'étudiant : ");
        double moyenne = scanner.nextDouble();

        // Afficher la mention correspondante
        if (moyenne >= 16) {
            System.out.println("Très Bien");
        } else if (moyenne >= 14) {
            System.out.println("Bien");
        } else if (moyenne >= 12) {
            System.out.println("Assez Bien");
        } else if (moyenne >= 10) {
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }

        scanner.close();
    }
}
