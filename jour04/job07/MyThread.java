package job07;

public class MyThread extends Thread{
  private int[] a;
  private int somme=0;

  public MyThread(int[] a){
    this.a=a;
  }

  public void run(){
    for(int i=0;i<this.a.length;i++){
      this.somme+=this.a[i];
    }
    System.out.println(this.somme);
  }
}