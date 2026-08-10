import java.util.Array;
import java.util.Arrays;
import java.util.Scanner;
public class secondlargest{
    public static int arrays( int[] numbers){
        Arrays.sort(numbers);
        int a = numbers.length;
        int second = numbers[a-2];
        return second;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {7,89,9,4,5,9,6,99,100};
        
        System.out.println(" second Largest element is = " + arrays(numbers));
    }
}