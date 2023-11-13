
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int values = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.next());
            
            if (number == 0) {
                break;
            }    
            
            if (number<0 || number>0) {
                values = values + 1;                
            }                                     
        }
        System.out.println("Number of numbers: " + values);
        

    }
}
