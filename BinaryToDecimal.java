import java.util.Scanner;

public class BinaryToDecimal {

    // Function to convert binary to decimal
    public static void convert(int binnum) {
        int pow = 0;
        int decnum = 0;

        while (binnum > 0) {
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }

        System.out.println("Decimal number is " + decnum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binnum = sc.nextInt();

        convert(binnum);
    }
}
