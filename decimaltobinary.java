import java.util.Scanner;
// bin = bin +(rem*(int)Math.pow(10,pow))
public class decimaltobinary {
    public static void dectobin(int n){
        int pow =0;
        int binarynumber = 0;
        while(n>0){
            int rem = n %2;
            binarynumber = binarynumber+(rem+(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(binarynumber);
        

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        dectobin(number);
    }

    
}
