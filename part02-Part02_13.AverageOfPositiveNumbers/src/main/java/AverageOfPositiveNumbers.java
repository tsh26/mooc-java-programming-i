
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double count = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            // if (count == 0) checks for if there are any positive numbers in each iteration. 
            if (count == 0 && value <=0) {
                System.out.println("Cannot calculate the average");
            }

            if (value == 0) {
                break;
            }
            
            if (count >= 0 && value > 0 ) {
                count = count + 1;
                sum = sum + value;
            }
        }
        System.out.println(sum/count);
    }
}