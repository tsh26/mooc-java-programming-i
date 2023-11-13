import java.util.Scanner;
 
public class ansMain {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ansGradeStatistics distribution = new ansGradeStatistics();
 
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
 
            distribution.addPointTotal(number);
        }
 
        distribution.print();
    }
}