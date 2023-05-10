import java.util.Scanner;

public class Job09 {
    
public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez un nombre :");
            String numero =myObj.nextLine();
            char premier='a',dernier='a';
            for (int i=0; i<numero.length();i++) {
                if (i==0){
                    premier=numero.charAt(i);
                }else if (i==numero.length()-1){
                    dernier=numero.charAt(i);
                }
                }
            System.out.println("Le premier chiffre de "+numero+" est : "+premier);
            System.out.println("Le premier chiffre de "+numero+" est : "+dernier);
        }
    }
}

