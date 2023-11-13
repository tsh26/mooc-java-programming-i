
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        String text = scanner.nextLine();
        
        if (text.isEmpty()) {
            break;
        }
        
        String[] pieces = text.split(" ");        
        for (String word: pieces) 
            if (word.contains("av")) {
                System.out.println(word);
                
        //or
        //for (int i = 0; i < pieces.length; i++) {
        //  if(pieces[i].contains("av") {
        //      System.out.println(pieces[i]);
       
            }            
        }    
    }
}
