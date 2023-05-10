import java.util.Scanner;

public class Job07 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez un nombre :");
            int nombre =Integer.parseInt( myObj.nextLine());
            int factorielle=1;
            for (int i=1; i<=nombre;i++) {
                factorielle*=i;
                }
            if(nombre==0){
                factorielle=1;
            }
            System.out.println("La factorielle de "+nombre+" est : "+factorielle);
        }
    }
}
