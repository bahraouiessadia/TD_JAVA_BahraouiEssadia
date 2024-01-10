package TD2;

public class Ex2 {
        private double abscisse;
        private double ordonnee;

        // Constructeurs
        public Ex2() {
            this.abscisse = 0.0;
            this.ordonnee = 0.0;
        }

        public Ex2(double abscisse, double ordonnee) {
            this.abscisse = abscisse;
            this.ordonnee = ordonnee;
        }

        // Getters et setters
        public double getAbscisse() {
            return abscisse;
        }

        public void setAbscisse(double abscisse) {
            this.abscisse = abscisse;
        }

        public double getOrdonnee() {
            return ordonnee;
        }

        public void setOrdonnee(double ordonnee) {
            this.ordonnee = ordonnee;
        }

        // Méthode Norme
        public double Norme() {
            return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
        }


        public static void main(String[] args) {
            // Test de la classe Point
            Ex2 point1 = new Ex2();
            System.out.println("Point 1 - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());
            System.out.println("Norme: " + point1.Norme());

            Ex2 point2 = new Ex2(3.0, 4.0);
            System.out.println("Point 2 - Abscisse: " + point2.getAbscisse() + ", Ordonnee: " + point2.getOrdonnee());
            System.out.println("Norme: " + point2.Norme());

            // Modification des coordonnées du point1
            point1.setAbscisse(5.0);
            point1.setOrdonnee(12.0);
            System.out.println("Point 1 après modification - Abscisse: " + point1.getAbscisse() + ", Ordonnee: " + point1.getOrdonnee());
            System.out.println("Norme: " + point1.Norme());
        }
}
