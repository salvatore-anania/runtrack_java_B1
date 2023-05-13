package job03;
import java.util.Random;
import java.io.*;

public class MyThread extends Thread{
  private int taille;
  private FileWriter fw;
  public MyThread(int taille, FileWriter fw){
    this.taille=taille;
    this.fw=fw;
  }

  public void run(){
    
    for(int i=0;i<this.taille;i++){
      Random test = new Random();
      char g = (char)('a'+test.nextInt(26));
      try {
        this.fw.write(g);
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
   
  }
}