package TD3;

public class PointEx2 {
    public void PointEx2 (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " " + y);
    }
    private int x, y;
}
class PointNom extends PointEx2 {
    private char nom;
    public void setPointNom(int x,int y,char nom) {
        PointEx2(x,y);
        this.nom =nom ;
    }
    public void setNom( char nom){
        this.nom=nom;
    }
    public void affCoordNom() {
        System.out.println("le nom de point est:" +nom);
        affCoord();
    }
    public static void main (String[] args){
        PointEx2 p =new PointEx2();
        p.PointEx2(3,2);
        p.affCoord();
        PointNom pn=new PointNom();
        pn.setPointNom(3,5,'a');
        pn.affCoordNom();
        pn.deplace(4,6);
        pn.affCoordNom();
    }

    }
