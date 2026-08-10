import java.util.Scanner;
public class functionsproduct {
    public static void productoftwo(int a , int b){
        int product = a * b;
        System.out.println(product);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        productoftwo(a, b);

    }
    
}
