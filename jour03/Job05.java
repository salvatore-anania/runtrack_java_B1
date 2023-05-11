public class Job05 {
    public static void main(String[] args) {
        int[] tableau = {3, 7, 3, 9, 8};
        int [] frequency = new int [tableau.length];
        int counted = -1;
        for(int i = 0; i < tableau.length; i++){
            int count = 1;
            for(int j = i+1; j < tableau.length; j++){
                if(tableau[i] == tableau[j]){
                count++;
        
                frequency[j] = counted;
                }
            }
            if(frequency[i] != counted)
                frequency[i] = count;
        }

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != counted && frequency[i] !=1)
                System.out.println("Element : "+tableau[i] + " occurence : " + frequency[i]);
        }
                
        }
}