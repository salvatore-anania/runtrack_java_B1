import java.util.Scanner;

public class Job11 {
    
public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez une hauteur de triangle :");
            int numero =Integer.parseInt( myObj.nextLine());
            for (int i=1; i<=numero;i++) {
                System.out.println("*".repeat(i));
                }
        }
    }
}