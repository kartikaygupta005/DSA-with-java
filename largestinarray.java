import java.util.Scanner;

public class largestinarray {

    public static int large(int numbers[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array:");
        int number = sc.nextInt();

        
        int numbers[] = new int[number];

        System.out.println("Enter the elements:");
        for (int k = 0; k < number; k++) {
            numbers[k] = sc.nextInt();   
        }

        
        System.out.println("Largest element is = " + large(numbers));

        sc.close();
    }
}