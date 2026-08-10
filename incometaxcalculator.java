import java.util.Scanner;
public class incometaxcalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if(salary>100){
           float tax=0.12f *salary;
           float remaining= salary-tax;
           System.out.println("tax payed "+tax+"salary remains "+ remaining);
             
        }
        else if(salary<100){
           int tax=0;
           int remaining= salary-tax;
           System.out.println("tax payed " + tax + " salary remains "+ remaining);

         }  
         else{
            System.out.println("salary remains same "+ salary);

         }
        
    }
}
