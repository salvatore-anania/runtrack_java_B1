public class Facture {
    
    public static void main(String[] args) {
        double prix=49.99;
        int quantite=3;
        double tarifHT=prix*quantite;
        double tva=tarifHT*0.20;
        double tarifTTC=tarifHT+tva;
        System.out.println("Le produit coute : "+prix);
        System.out.println("Le total est de : "+tarifHT);
        System.out.println("Le total est de : "+tarifTTC);
    }
}
