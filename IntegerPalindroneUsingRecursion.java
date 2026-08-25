import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print( num == reversed(num , 0 ));
    }
    private static int reversed(int num , int reverse){
        if(num == 0 ){
            return reverse ; 
        }
        int digit = num % 10 ;
        reverse = reverse *10 + digit ; 
        return reversed(num/10 , reverse);
    }
}
