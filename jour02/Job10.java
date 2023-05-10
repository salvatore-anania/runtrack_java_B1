import java.util.Scanner;

public class Job10 {
    
public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez un nombre :");
            String numero =myObj.nextLine();
            int somme=0;
            for (int i=0; i<numero.length();i++) {
                somme+=Character.getNumericValue(numero.charAt(i));
                }
            System.out.println("Le somme des chiffres de "+numero+" est : "+somme);
        }
    }
}