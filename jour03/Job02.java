
import java.util.Arrays;

public class Job02 {
    public static void main(String[] args) {
        int[] tableau = {12,6,76,89};
        System.out.println(Arrays.toString(tableau));
        for(int i=0;i<tableau.length;i++){
            tableau[i]=i;
        }
        System.out.println(Arrays.toString(tableau));
            
    }
}

