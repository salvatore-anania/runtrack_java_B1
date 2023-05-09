import java.util.Scanner;

public class MinuteInHour {
    
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Entrez une durée en minutes :");
            int minutes =Integer.parseInt( myObj.nextLine());
              // Read user input
            System.out.println(minutes+" est équivalent à "+ minutes/60 +" heures et " + minutes%60 +" minutes");  // Output user input
        }
      }
}

