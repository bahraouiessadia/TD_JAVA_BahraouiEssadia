package TD2;

public class Ex4Temps {
    private int heures,minutes,secondes;
    public Ex4Temps(){
    }
    public Ex4Temps(int heures){
        this.heures=heures;
    }
    public Ex4Temps(int heures,int minutes){
        this.heures=heures;
        this.minutes=minutes;
    }
    public Ex4Temps(int heures,int minutes,int secondes){
        this.heures=heures;
        this.minutes=minutes;
        this.secondes=secondes;
    }
    public Ex4Temps(Ex4Temps t){
        this.heures=t.getHeures();
        this.minutes=t.getMinutes();
        this.secondes=t.getSecondes();
    }
    public int getHeures() {
        return heures;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSecondes() {
        return secondes;
    }
    public void setHeures(int heures) {
        this.heures = heures;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }
    public void ajouterHeures(int h){
        this.heures += h;
        if(this.heures>23){
            this.heures %=24;
        }
    }
    public void ajouterMinutes(int m){
        this.minutes += m;
        if(this.minutes > 59){
            ajouterHeures(minutes/60);
            this.minutes %=60;
        }
    }
    public void ajouterSecondes(int s){
        this.secondes +=s;
        if(this.secondes>59){
            ajouterMinutes(secondes/60);
            this.secondes %=60;
        }
    }
    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }
    public static void main (String[] args){
        Ex4Temps temps = new Ex4Temps( 3,10,10);
        System.out.println(temps.toString());
        temps.ajouterMinutes(180);
        System.out.println(temps);
        temps.ajouterSecondes(3600);
        System.out.println(temps);
    }

}
