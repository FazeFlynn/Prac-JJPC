import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 

public class CollectorsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evens = numbers.stream()
                                      .filter(x -> x % 2 == 0)
                                      .collect(Collectors.toList());
        System.out.println(evens); // Output: [2, 4]
    }
}