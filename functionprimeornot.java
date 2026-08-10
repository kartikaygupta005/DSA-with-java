import java.util.Scanner;
public class functionprimeornot {
    public static boolean primeornot(int a){
        boolean isPrime = true;
        for(int i = 2 ; i <= Math.sqrt(a); i++){
            if (a%i ==0){
                isPrime = false;
                break;
            }

        }
        return isPrime;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean result = primeornot(a);
        System.out.print(result);
    }
    
}
