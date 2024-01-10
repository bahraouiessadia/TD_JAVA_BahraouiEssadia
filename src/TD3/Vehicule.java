package TD3;

public class Vehicule {
    private int nbPassager;
    Vehicule(int n) {
        this.nbPassager = n;
    }
    public int getNbPassager() {
        return nbPassager;
    }
    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }
    @Override
    public String toString() {
        return "Vehicule{" +
                "nbPassager=" + nbPassager +
                '}';
    }
    class Moto extends Vehicule{
        private int nbRoues=2;
        Moto(int n,int nbRoues){
            super(n);
            this.nbRoues=nbRoues;
        }
        Moto(int n){
            super(n);
        }
    }
    class Avion extends Vehicule{
        private int nbMoteur;
        Avion(int nbP){
            super(nbP);
        }
        Avion(int nbP, int nbM){
            super(nbP);
            this.nbMoteur=nbM;
        }
    }
    class Triporteur extends Moto{
        Triporteur(int nbM){
            super(nbM);
        }
    }
    public void main(String[] args) {
        // Test de la classe Vehicule
        Vehicule vehicule = new Vehicule(4);
        System.out.println(vehicule.toString());

        // Test de la classe Moto
        Moto moto = new Moto(1);
        System.out.println(moto.toString());

        // Test de la classe Avion
        Avion avion1 = new Avion(150);
        System.out.println(avion1.toString());

        Avion avion2 = new Avion(200, 4);
        System.out.println(avion2.toString());

        // Test de la classe Triporteur
        Triporteur triporteur = new Triporteur(2);
        System.out.println(triporteur.toString());
    }
}
