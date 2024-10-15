import java.util.Arrays;

// Step 1: Define a functional interface
@FunctionalInterface
interface Mapper<T, R> {
    R map(T input);
}

// Step 2: Implement the custom map function
public class Mappers {
    public static <T, R> R[] customMap(T[] inputArray, Mapper<T, R> mapper, R[] outputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = mapper.map(inputArray[i]);
        }
        return outputArray;
    }

    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 4 };
        Integer[] squares = new Integer[numbers.length];

        // Step 3: Use the custom map function
        customMap(numbers, x -> x * x, squares);

        // Output the result
        System.out.println(Arrays.toString(squares)); // Output: [1, 4, 9, 16]
    }
}




