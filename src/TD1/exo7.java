package TD1;
import java.util.Scanner;
public class exo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir un entier de trois chiffres non nuls
        int nombre;
        do {
            System.out.print("Entrez un entier de trois chiffres non nuls : ");
            nombre = scanner.nextInt();
        } while (nombre < 100 || nombre > 999);

        // Afficher les nombres formés par les chiffres de N
        System.out.print("Les nombres formés par les chiffres de " + nombre + " sont : ");
        afficherCombinaisons(nombre);

        scanner.close();
    }

    // Méthode pour afficher les combinaisons des chiffres de l'entier
    public static void afficherCombinaisons(int n) {
        int centaine = n / 100;
        int dizaine = (n % 100) / 10;
        int unite = n % 10;

        System.out.print(n + ", ");

        // Afficher toutes les permutations des chiffres
        System.out.print(centaine * 100 + dizaine * 10 + unite + ", ");
        System.out.print(centaine * 100 + unite * 10 + dizaine + ", ");
        System.out.print(dizaine * 10 + centaine * 100 + unite + ", ");
        System.out.print(dizaine * 10 + unite * 100 + centaine + ", ");
        System.out.print(unite * 100 + centaine * 10 + dizaine + ", ");
        System.out.print(unite * 100 + dizaine * 10 + centaine);
    }

}
