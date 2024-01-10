package TD2;

public class Ex6Banque {
    private int ncompte;
    private float solde;
    private String cin ;
    public Ex6Banque(){}
    public Ex6Banque(int ncompte,float solde,String cin){
        this.ncompte=ncompte;
        this.solde=solde;
        this.cin=cin;
    }
    public void deposer(float solde){
        this.solde += solde;
    }
    public void retirer(float solde){
        if(this.solde>solde)
            this.solde -=solde;}
    public float avoirSolde(){
        return solde;}
    public String avoirInf(){
        return "Banque{" +
                "ncompte=" + ncompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
    public static void main (String[] args){
        Ex6Banque compte = new Ex6Banque(1,5000.75f,"AB1200");
        System.out.println(compte.avoirInf());
        System.out.println(compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.avoirInf());
        System.out.println(compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte.avoirInf());
        System.out.println(compte.avoirSolde());

    }

}
