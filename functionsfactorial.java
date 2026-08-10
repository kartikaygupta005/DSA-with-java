import java.util.Scanner;
public class functionsfactorial {
    public static int factorial(int a){
        int f = 1;
        for(int i = a ; i >= 1 ; i --){
            f = f*i;
        }
        return f;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = factorial(a);
        System.out.print("factorial of "+ a + " is "+ result);
    }
}
