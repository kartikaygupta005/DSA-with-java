import java.util.Scanner;
public class pairs {
    public static void arrays(int[] numbers){
        for(int i = 0 ; i < numbers.length ; i++ ){
            for(int j = i+1 ; j < numbers.length ; j ++ ){
                System.out.println("(" + numbers[i] + numbers[j] + ")");
            }
        }


    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7};
        arrays( numbers);

    }
}
