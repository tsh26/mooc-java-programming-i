
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        /*
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println("");
        
        
        int[] table = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(table, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(table, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(table, 2));

        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
         */
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    //method for returning the smallest number in the array
    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;

    }

    //method for returning the index of the smallest number in the array
    public static int indexOfSmallest(int[] array) {
        int smallestIndex = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    //method for returning the index of smallest number with a condition
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        int smallest = table[startIndex];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    //method of swapping location of two numbers in an array
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int storer = array[index1];
        array[index1] = array[index2];
        array[index2] = storer;

    }

    //method of sorting from smallest to largest number in the array using methods above
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array));
            
            MainProgram.indexOfSmallest(array);
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
    }
}
