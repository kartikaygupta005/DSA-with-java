import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        int product =1;
        int result = factorial(num);
        System.out.print(result);
    }
    private static int factorial(int num){
        if(num == 1 ){
            return 1;
        }
        return num*factorial(num-1);
    }
}
