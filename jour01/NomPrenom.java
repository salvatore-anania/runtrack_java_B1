import java.util.Scanner;

public class NomPrenom {
    
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez votre nom :");
            String nom = myObj.nextLine();
            System.out.println("Entrez votre nom :");
            String prenom = myObj.nextLine();
   
              // Read user input
            System.out.println("Votre nom est " + nom+" et votre prénom est " + prenom);  // Output user input
        }
      }
}
