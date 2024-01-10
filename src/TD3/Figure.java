package TD3;
import java.lang.Math;

public class Figure {
    abstract class Figure {
        private String nom;
        public Figure(){}
        public Figure( String nom){
            this.nom=nom;
        }
        public abstract String getPerimeter();
        public abstract String getAire();
        @Override
        public String toString() {
            return "Figure{" +
                    "nom='" + nom + '\'' +
                    '}';
        }
    }
    class Disque extends Figure{
        private int rayon;
        private int centre;
        public Disque(){
            super();
        }
        public Disque (int rayon,int centre){
            this.rayon=rayon;
            this.centre=centre;
        }
        public Disque (int rayon,int centre,String nom){
            super(nom);
            this.rayon=rayon;
            this.centre=centre;
        }
        public int getRayon() {
            return rayon;
        }
        public void setRayon(int rayon) {
            this.rayon = rayon;
        }
        public void setCentre(int centre) {
            this.centre = centre;
        }
        public int getCentre() {
            return centre;
        }
        @Override
        public String getPerimeter() {
            return "le perimetre de ce disque est:"+2*Math.PI*getRayon();
        }
        @Override
        public String getAire() {
            return "l'aire de ce disque est:" +Math.PI*getRayon()*getRayon();
        }
    }
    class Rectangle extends Figure{
        private int largeur;
        private int longueur;
        public Rectangle(){}
        public Rectangle(int largeur,int longueur){
            this.largeur=largeur;
            this.longueur=longueur;
        }
        public Rectangle(int largeur,int longueur,String nom){
            super(nom);
            this.largeur=largeur;
            this.longueur=longueur;
        }
        public int getLargeur() {
            return largeur;
        }
        public void setLargeur(int largeur) {
            this.largeur = largeur;
        }
        public int getLongueur() {
            return longueur;
        }
        public void setLongueur(int longueur) {
            this.longueur = longueur;
        }
        @Override
        public String getPerimeter() {
            return "le perimetre de ce rectangle est:"
                    +2*(getLargeur()+getLongueur());
        }
        @Override
        public String getAire() {
            return "l'aire de ce rectangle est :"+getLargeur()*getLongueur();
        }
        @Override
        public String toString() {
            return "Rectangle{" +
                    "largeur=" + largeur +
                    ", longueur=" + longueur +
                    '}';
        }}}


