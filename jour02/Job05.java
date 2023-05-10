import java.util.Scanner;

public class Job05 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez votre âge :");
            int age =Integer.parseInt( myObj.nextLine());
            if (age<16){
                System.out.println("Vous ne pouvez pas travailler !");
            }else if (age>67){
                    System.out.println("Vous êtes à la retraite !");
            }else if (age>55){
                System.out.println("Vous aurais du mal à trouver un emploi !");
            }else{
                System.out.println("Vous pouvez travailler !");
            }
        }
    }
}
