
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        System.out.println(sum(numbers));
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
            
        }
        return sum;
    }
}
