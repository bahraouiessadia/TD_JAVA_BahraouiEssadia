package TD2;

public class Ex3Livre {
    private String titre;
    private String auteur;
    private double prix;
    private String annee;
    Ex3Livre(String titre){
        this.titre=titre;
    }
    Ex3Livre(String titre,String auteur){
        this.titre=titre;
        this.auteur=auteur;
    }
    Ex3Livre(String titre,String auteur,double prix){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }
    Ex3Livre(String titre,String auteur,double prix,String annee){
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
        this.annee=annee;
    }
    public Ex3Livre(Ex3Livre l){
        this.titre=l.getTitre();
        this.auteur=l.getAuteur();
        this.prix=l.getPrix();
        this.annee=l.getAnnee();
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public String getAnnee() {
        return annee;
    }
    public void setAnnee(String annee) {
        this.annee = annee;
    }
    @Override
    public String toString() {
        return "Ex3Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", annee='" + annee + '\'' +
                '}';
    }
    public static void main (String[] args){
        Ex3Livre L = new Ex3Livre("maykel","jhon",500,"1865");
        String a = L.auteur;
        String t = L.titre;
        double p = L.prix;
        String an = L.annee;
        System.out.println("l'auteur est:"+L.auteur);
        System.out.println("le titre est:"+L.titre);
        System.out.println("le prix est:"+L.prix);
        System.out.println("l'annee est:"+L.annee);
    }
}


