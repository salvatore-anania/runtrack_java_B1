package job06;

public class Somme {
    public static void main(String[] args) {
        int[] a = {2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5,2,2,5,9,4,2,4356,324,4356,3456,9,9,9,9,9,9,5};
        int somme=0;
        long startTime = System.nanoTime();
        for(int i=0;i<a.length;i+=1){
            somme+=a[i];
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("La somme est de : " + somme);
        System.out.println("Temps d'execution en millisecondes : " + timeElapsed);
    }
}
