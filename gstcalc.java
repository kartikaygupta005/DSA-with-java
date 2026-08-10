import java.util.Scanner;

public class gstcalc {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float itme1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float  item3 = sc.nextFloat();
        float total = itme1+item2+item3;
        // add 18% gst
        double newtotal = total + (0.18*total);
        System.out.println("Bill with gst is "+ newtotal);
    }

}
