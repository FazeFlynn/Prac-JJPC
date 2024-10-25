import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HM {
    public static void main (String[] args){
        // HM t = new HM();

        List<String> names = Arrays.asList("Alice", "Bob","oy","ed", "Charliesa", "id", "Even");
        Map<Integer, String> map = names.stream().collect(Collectors.toMap(String::length, Function.identity(),      // Value: the string itself
        (existing, replacement) -> replacement // Keep the existing value if there is a duplicate
        ));

        System.out.println(map);        
    }
}