import java.util.*;
public class main{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = recursion(n);
        System.out.print(count);
    }
    private static int recursion(int n){
        if(n == 0 || n == 1){
            return 1 ;
        }
        return recursion(n - 1) + recursion(n-2); 
    }
}
