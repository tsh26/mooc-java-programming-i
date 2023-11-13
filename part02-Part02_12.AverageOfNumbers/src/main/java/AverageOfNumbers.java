
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        double avg = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value == 0) {
                break;
            }
            if (value > 0 || value <0) {
                sum = sum + value;
                number = number + 1;
                avg = sum/number;
                
            }
            
        }
        System.out.println("Average of the numbers: " + (double)avg);
    }
}

