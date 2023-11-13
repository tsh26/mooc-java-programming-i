
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == -1) {
                break;
            }
            list.add(inputNumber);
        }
        System.out.println("");
        
        int sum = 0;
        
        for (Integer integer: list) {
            sum += integer;                        
        }
        System.out.println("Average: " + (double)sum/list.size());
        
        
        
        
        
    }
}
