package TD1;
import java.util.Scanner;
public class Exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire l'heure
        System.out.print("Entrez l'heure (format 24 heures) : ");
        int heure = scanner.nextInt();

        // Lire le choix de la langue
        System.out.print("Entrez la langue ('f' pour français, 'a' pour anglais) : ");
        char choixLangue = scanner.next().charAt(0);

        // Afficher le message en fonction de l'heure et de la langue
        if (choixLangue == 'f') {
            afficherSalutationFrancais(heure);
        } else if (choixLangue == 'a') {
            afficherSalutationAnglais(heure);
        } else {
            System.out.println("Langue non reconnue.");
        }

        scanner.close();
    }

    // Méthode pour afficher les salutations en français
    public static void afficherSalutationFrancais(int heure) {
        if (heure >= 0 && heure < 18) {
            System.out.println("Bonjour");
        } else if (heure >= 18 && heure < 22) {
            System.out.println("Bonsoir");
        } else {
            System.out.println("Bonne nuit");
        }
    }

    // Méthode pour afficher les salutations en anglais
    public static void afficherSalutationAnglais(int heure) {
        if (heure >= 0 && heure < 18) {
            System.out.println("Good Morning");
        } else if (heure >= 18 && heure < 22) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
