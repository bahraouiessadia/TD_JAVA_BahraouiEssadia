package TD1;
import java.util.Scanner;
public class Exo10 {
    public static void main(String[] args) {
        System.out.println("Entiers cubiques de trois chiffres :");

        for (int i = 100; i <= 999; i++) {
            if (estCubique(i)) {
                System.out.println(i);
            }
        }
    }

    // Méthode pour vérifier si un entier est cubique
    public static boolean estCubique(int nombre) {
        int sommeCubes = 0;
        int temp = nombre;

        while (temp > 0) {
            int chiffre = temp % 10;
            sommeCubes += chiffre * chiffre * chiffre;
            temp /= 10;
        }

        return sommeCubes == nombre;
    }
}
