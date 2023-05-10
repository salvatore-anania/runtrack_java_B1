public class Job12 {
    
public static void main(String[] args) {
    int combinaison=0;
    for (int i=1; i<=6;i++) {
        combinaison++;
        for (int j=1; j<=6;j++) {
            combinaison++;
            for (int k=1; k<=6;k++) {
                combinaison++;
                System.out.println(""+i+j +k);
                }
            }
        }
    System.out.println("il y a "+combinaison+" combinaisons avec trois dés.");
    }   
}