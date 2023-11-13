
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        int first = Integer.valueOf(scanner.nextLine());

        if (first <0)  {
            System.out.println(first * -1);
        } else {
            System.out.println(first);
        }
        

    }
}
