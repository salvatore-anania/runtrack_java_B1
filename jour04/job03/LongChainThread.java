package job03;
import java.util.Scanner;
import java.io.*;

public class LongChainThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Quelle taille de chaine de caracter aléatoire créer ?");
        System.out.println("Taille :");
        try (Scanner myObj = new Scanner(System.in)) {
            int taille = Integer.parseInt(myObj.nextLine());
            long startTime = System.nanoTime();
            FileWriter fw=null;
            try {
              fw = new FileWriter("output-thread.txt");
            } catch (IOException e) {
              e.printStackTrace();
            }
            MyThread t1= new MyThread((taille/2),fw);
            MyThread t2= new MyThread((taille/2),fw);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            try {
              fw.close();
            } catch (IOException e) {
              e.printStackTrace();
            }
            System.out.println("Temps d'execution en millisecondes : " + timeElapsed / 1000000);
            
        }
    }
}

