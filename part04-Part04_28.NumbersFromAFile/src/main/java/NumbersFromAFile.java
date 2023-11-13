
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        
        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNext()) {
                list.add(fileScanner.nextLine());                
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());            
        }
        
        for (String item: list) {
            int number = Integer.valueOf(item);
            if (number >= lowerBound && number <= upperBound) {
                count +=1;
            } else {
                continue;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
