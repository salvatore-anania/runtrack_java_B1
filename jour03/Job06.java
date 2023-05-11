import java.util.Arrays;
import java.util.Random;

public class Job06 {
    public static void main(String[] args) {
        int[] tableau = new int[10];
        for(int i=0;i<tableau.length;i++){
            tableau[i]= new Random().nextInt(1000);
        }
        System.out.println(Arrays.toString(tableau));
            
    }
}