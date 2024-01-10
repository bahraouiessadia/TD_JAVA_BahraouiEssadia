package TD3;

public class Ex1 {
    public void Ex1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    private int x, y;
}
class PointA extends Ex1{
    void affich (){
        System.out.println("les coordonnees sont :" + getX() + " "
                +getY());
    }
    public static void main (String[] args){
        Ex1 p = new Ex1();
        p.Ex1(3,5);
        System.out.println("les coordonnees sont :" +p.getX() + " "
                +p.getY());
        PointA pa = new PointA();
        pa.Ex1(4,2);
        pa.affich();
    }

}
