package TD2;

public class Ex1Point {
    private String nom;
    private double abscisse ;
    public Ex1Point (String nom , double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void affich(){
        System.out.println("le nom est:" +this.nom+ "l'abscisse est :"
                +this.abscisse);
    }
    public double translate( double a){
        return (this.abscisse+a);
    }
    @Override
    public String toString() {
        return "Point{" +
                "nom='" + nom + '\'' +
                ", abscisse=" + abscisse +
                '}';
    }
    public static void main (String[] args){
        Ex1Point c =new Ex1Point("abb",9.2);
        System.out.println(c.toString());
        c.affich();
        double x = c.translate(3.6);
        System.out.println(x);
    }
}
