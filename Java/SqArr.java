// import java.util.stream.*;
import java.util.Arrays;

public class SqArr {

    public static void main (String[] args){
        // SqArr t = new SqArr();

        int[] num = {1,2,3,4,5};
        num = Arrays.stream(num).map(x -> x*x).toArray();
        System.out.println(Arrays.toString(num));  
        
        for (int n : num) {
            n = n*n;
            System.out.println(n);
        }

        System.out.println(Arrays.toString(num));        
    }
}