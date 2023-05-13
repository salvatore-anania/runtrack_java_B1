package job02;
import java.util.Scanner;
import java.util.Random;
import java.io.*; 

public class LongChain {
    public static void main(String[] args) {
        System.out.println("Quelle taille de chaine de caracter aléatoire créer ?");
        System.out.println("Taille :");
        try (Scanner myObj = new Scanner(System.in)) {
            int taille = myObj.nextInt();
            long startTime = System.nanoTime();
            try {
                FileWriter fw = new FileWriter("output.txt");
                for(int i=0;i<taille;i++){
                    char c= (char)('a'+new Random().nextInt(26));
                    
                    fw.write(c);
                }
                fw.close();
                long endTime = System.nanoTime();
                long timeElapsed = endTime - startTime;
                System.out.println("Temps d'execution en millisecondes : " + timeElapsed / 1000000);
              } catch (IOException e) {
                e.printStackTrace();
              }
        }
    }
}

