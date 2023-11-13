
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String longestName ="";
        int count = 0;
        
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String[] data = text.split(",");
            String name = data[0];
            
            if (name.length() > longestName.length()) {
                longestName = name;
                
            }
            int birthYear = Integer.valueOf(data[1]);
            sum += birthYear;
            count++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum / count);
    }
}
