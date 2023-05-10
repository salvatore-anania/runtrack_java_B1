import java.util.Scanner;

public class Job03 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez un nombre :");
            int nombre =Integer.parseInt( myObj.nextLine());
            for (int i=0; i<=10;i++) {
                System.out.println(i+" X "+nombre+" = "+i*nombre);
                } 
    }
}
}
