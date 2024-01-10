package TD3;
import java.lang.Math;

public abstract class Figure {
    protected String nom;

    public Figure() {
        this.nom = "Figure";
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double getPerimeter();

    public abstract double getAire();

    @Override
    public String toString() {
        return "Figure: " + nom;
    }
}

class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque() {
        super("Disque");
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }

    public Disque(Point centre, double rayon) {
        super("Disque");
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Point centre, double rayon, String nom) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Disque: " + nom + ", Centre: " + centre + ", Rayon: " + rayon;
    }
}

class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle() {
        super("Rectangle");
        this.longueur = 1.0;
        this.largeur = 1.0;
    }

    public Rectangle(double longueur, double largeur) {
        super("Rectangle");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle: " + nom + ", Longueur: " + longueur + ", Largeur: " + largeur;
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    public static void main(String[] args) {
        Disque disque1 = new Disque(new Point(0, 0), 5.0, "Grand Disque");
        System.out.println(disque1);
        System.out.println("Périmètre: " + disque1.getPerimeter());
        System.out.println("Aire: " + disque1.getAire());

        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "Rectangle A");
        System.out.println(rectangle1);
        System.out.println("Périmètre: " + rectangle1.getPerimeter());
        System.out.println("Aire: " + rectangle1.getAire());
    }
}


