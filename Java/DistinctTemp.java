import java.util.Scanner;
import java.util.HashMap;


public class DistinctTemp {

    static int longestPeriod(int[] temp){
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for(int i = 0; i < temp.length; i++) {
            if(map.containsKey(temp[i])){
                left = Math.max(left, map.get(temp[i]) + 1);
            }

            maxLength = Math.max(maxLength, i - left + 1);
            map.put(temp[i], i);            
        }

        return maxLength;
    }

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter no of Temperature: ");

        int n = input.nextInt();

        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            // System.out.println("enter temp " + (i+1) + " : ");
            temp[i] = input.nextInt(); // the error was here as temp was written as temps
                        
        }  
        
        System.out.println();

        System.out.println(longestPeriod(temp));        
        
        
    }
}