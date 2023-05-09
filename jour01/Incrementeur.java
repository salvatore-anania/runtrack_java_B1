import java.util.Scanner;

public class Incrementeur {

    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
        System.out.println("Entrez un nombre :");
        int nombre =Integer.parseInt( myObj.nextLine());
        for (int i=0; i<=nombre;i++) {
            System.out.println(i);
            }
            
    }
    }
}
