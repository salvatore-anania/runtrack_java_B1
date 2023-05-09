import java.util.Scanner;

public class Somme {
    
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez un premier nombre :");
            int un = Integer.parseInt(myObj.nextLine());
            System.out.println("Entrez un deuxiéme nombre :");
            int deux = Integer.parseInt(myObj.nextLine());
            
              // Read user input
            System.out.println("La somme est " + (un+deux));  // Output user input
        }
      }
}

