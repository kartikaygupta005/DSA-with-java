import java.util.Scanner;
public class creatinganarray {
    public static void main(String[] args) {
        int marks[]= new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        System.out.println(marks[3]);
        System.out.println("Length of an array - "+ marks.length);
    }
    
}
