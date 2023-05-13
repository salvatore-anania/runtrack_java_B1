package job05;
import java.util.Scanner;

public class CountThread {
    public static void main(String[] args) {
      System.out.println("Jusqu'à quelle nombre compter ?");
        System.out.println("Nombre :");     
        try (Scanner myObj = new Scanner(System.in)) {
          int taille = Integer.parseInt(myObj.nextLine());
          long startTime = System.nanoTime();
          MyThread t1= new MyThread((taille/2));
          MyThread t2= new MyThread((taille/2));
          t1.start();
          t2.start();
          long endTime = System.nanoTime();
          long timeElapsed = endTime - startTime;
          System.out.println("Temps d'execution en millisecondes : " + timeElapsed );
      }
    }
}

