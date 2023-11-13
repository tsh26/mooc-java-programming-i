
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // insert test code here

        /*
        //example of sorting arrays using Arrays class
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
         */
 /*
        //example of sorting lists using Collections class
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
         */
        //calling method 1
        System.out.println("Array of integers");
        int[] intArray = {3, 1, 5, 99, 3, 12};               
        System.out.println("Before sorting: " + Arrays.toString(intArray));
        sort(intArray);
        System.out.println("After sorting: " + Arrays.toString(intArray));
        //calling method 1a
        sortDecrease(intArray);
        System.out.println("After sorting in decreasing order: " + Arrays.toString(intArray));
        System.out.println("");

        //calling method 2
        System.out.println("Array of strings");
        String[] stringArray = {"Hello", "these", "are", "different", "strings"};
        System.out.println("Before sorting: " + Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println("After sorting: " + Arrays.toString(stringArray));
        System.out.println("");
        
        //calling method 3
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(530);
        numbers.add(26);
        System.out.println("Before sorting: " + numbers);
        sortIntegers(numbers);
        System.out.println("After sorting: " + numbers);
        //calling method 3a
        sortIntegersDecrease(numbers);
        System.out.println("After sorting in decreasing order: " +numbers);
        System.out.println("");

        //calling method 4
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Boppity");
        strings.add("Bippity");
        strings.add("Humpty");
        strings.add("Dumpty");
        System.out.println("Before sorting: " + strings);
        sortStrings(strings);
        System.out.println("After sorting: " + strings);
        System.out.println("");
        
    }
    //method 1: sorting an INTEGER ARRAY (increasing order)
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    // Method 1a to sort an array of integers in decreasing order
    public static void sortDecrease(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        }
    }

    //method 2: sorting a STRING ARRAY
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    //method 3: sorting INTEGER LIST (increasing order)
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    // Method 3a: to sort an ArrayList of integers in decreasing order
    public static void sortIntegersDecrease(ArrayList<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
    }

    //method 4: sorting STRINGS LIST
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);

    }

}
