import java.util.Scanner;

public class Job08 {
    
public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez un nombre :");
            String numero =myObj.nextLine();
            
            System.out.println("Il y a "+numero.length()+" chiffre dans "+numero);
        }
    }
}
