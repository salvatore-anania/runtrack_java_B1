package job04;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("Jusqu'à quelle nombre compter ?");
        System.out.println("Nombre :");
        try (Scanner myObj = new Scanner(System.in)) {
            int taille = Integer.parseInt(myObj.nextLine());
            long startTime = System.nanoTime();
            for(int i=1;i<taille;i++){
            }
            long endTime = System.nanoTime();
                long timeElapsed = endTime - startTime;
                System.out.println("Temps d'execution en millisecondes : " + timeElapsed );
        }
    }
}

