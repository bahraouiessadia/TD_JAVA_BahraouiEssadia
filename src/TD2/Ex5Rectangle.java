package TD2;

public class Ex5Rectangle {
    private double longueur;
    private double largeur;
    public Ex5Rectangle(){}
    public Ex5Rectangle(double longueur,double largeur){
        this.longueur= longueur;
        this.largeur= largeur;
    }
    Ex5Rectangle(Ex5Rectangle rectangle){
        this.longueur=rectangle.getLongueur();
        this.largeur=rectangle.getLargeur();
    }
    public double getLongueur() {
        return longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur >0 ? longueur:0;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur >0 ? largeur:0;
    }
    public double calPerimetre(){
        return 2*(this.longueur+this.largeur);
    }
    public double calAire(){
        return this.longueur*this.largeur;
    }
    public boolean isCarre(){
        if(this.longueur==this.largeur)
            return true;
        else
            return false;}
    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
    public static void main (String[] args){
        Ex5Rectangle r = new Ex5Rectangle(6.3,2.3);
        System.out.println(r.toString());
        System.out.println("la longueur est:" + r.longueur );
        System.out.println("la largeur est:" +r.largeur);
    }

}
