package TD3;

public class Batiment {
    private String adress;
    Batiment(){
    }
    Batiment(String adress){
        this.adress=adress;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    @Override
    public String toString() {
        return "Batiment{" +
                "adress='" + adress + '\'' +
                '}';
    }
    class Maison extends Batiment{
        private int nbCHambres;
        Maison(){
        }
        public Maison( String adress,int nbCHambres){
            super(adress);
            this.nbCHambres=nbCHambres;
        }
        public int getNbCHambres() {
            return nbCHambres;
        }
        public void setNbCHambres(int nbCHambres) {
            this.nbCHambres = nbCHambres;
        }
        @Override
        public String toString() {
            return "Maison{" +
                    "nbCHambres=" + nbCHambres +
                    '}';
        }
    }
    class Immeuble extends Batiment{
        private int nbAppart;
        Immeuble(){
        }
        Immeuble(String adress,int nbAppart){
            super(adress);
            this.nbAppart=nbAppart;
        }
        public int getNbAppart() {
            return nbAppart;
        }
        public void setNbAppart(int nbAppart) {
            this.nbAppart = nbAppart;
        }
        @Override
        public String toString() {
            return "Immeuble{" +
                    "nbAppart=" + nbAppart +
                    '}';
        }
    }

    public void main(String[] args) {
        // Test de la classe Bâtiment
        Batiment batiment1 = new Batiment();
        Batiment batiment2 = new Batiment("123 Rue de la Ville");

        System.out.println(batiment1.toString());
        System.out.println(batiment2.toString());

        // Test de la classe Maison
        Maison maison1 = new Maison();
        Maison maison2 = new Maison("456 Rue du Quartier", 3);

        System.out.println(maison1.toString());
        System.out.println(maison2.toString());

        // Test de la classe Immeuble
        Immeuble immeuble1 = new Immeuble();
        Immeuble immeuble2 = new Immeuble("789 Avenue du Centre", 10);

        System.out.println(immeuble1.toString());
        System.out.println(immeuble2.toString());
    }}
