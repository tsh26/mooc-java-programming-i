
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        System.out.println("");
        int value = Integer.valueOf(scanner.nextLine());
        
        while (i <= value) {
            System.out.println(i);
            i++;
            
        }
    }
}
