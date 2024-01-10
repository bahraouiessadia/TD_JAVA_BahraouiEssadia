package TD3;

public class Ex3Point {
    private int x, y;
    public Ex3Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public void affiche() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class Centre extends Ex3Point{
    private String nom;
    Centre(int x,int y,String nom){
        super(x,y);
        this.nom=nom;
    }
    public String getNom() {
        return nom;
    }
    public void affNom() {
        System.out.println("nom est:"+this.getNom());
    }
    public void affiche(){
        System.out.println("nom est:"+this.getNom()+"x = " +this.getX()+"y = "+this.getY());
    }
}
class Cercle extends Centre{
    int rayon;
    public Cercle(int x,int y,String nom,int rayaon){
        super(x,y,nom);
        this.rayon=rayon;
    }
}
class Main {
    public static void main(String[] args) {
        Ex3Point point = new Ex3Point(1, 2);
        Centre centre = new Centre(2, 5, "o");
        Cercle cercle = new Cercle(2, 5, "c", 5);
        point.affCoord();
        centre.affCoord();
        centre.affNom();
        cercle.affNom();
    }

}

