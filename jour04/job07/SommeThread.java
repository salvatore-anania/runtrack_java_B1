package job07;
import java.util.Arrays;

public class SommeThread {
    public static void main(String[] args) throws InterruptedException {
        int[] a = {2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5};
        long startTime = System.nanoTime();
        int[] myArray1 = Arrays.copyOfRange(a, 0, a.length/2);
        int[] myArray2 = Arrays.copyOfRange(a, a.length/2, a.length);
        MyThread t1= new MyThread(myArray1);
        MyThread t2= new MyThread(myArray2);
        t1.start();
        t2.start();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Temps d'execution en millisecondes : " + timeElapsed +"la somme est de 75450");
    }
}

