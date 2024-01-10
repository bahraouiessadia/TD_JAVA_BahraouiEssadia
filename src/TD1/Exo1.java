package TD1;
import java.util.Scanner;
public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire les trois variables au clavier
        System.out.print("Entrez la première variable : ");
        int variable1 = scanner.nextInt();

        System.out.print("Entrez la deuxième variable : ");
        int variable2 = scanner.nextInt();

        System.out.print("Entrez la troisième variable : ");
        int variable3 = scanner.nextInt();

        // Trouver le maximum des trois variables
        int maximum = trouverMaximum(variable1, variable2, variable3);

        // Afficher le résultat
        System.out.println("Le maximum des trois variables est : " + maximum);

        scanner.close();
    }


    public static int trouverMaximum(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
