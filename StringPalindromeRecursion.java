import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine() ;
         int len = str.length()-1;
         StringBuilder answer = new StringBuilder(); 
        String j = reversed(str , answer , len );
        System.out.print(str.equals(j));
    }
    private static String reversed(String str , StringBuilder answer, int len){
        if(len == 0){
            answer.append(str.charAt(len));
            return answer.toString() ;
        }
        return reversed(str , answer.append(str.charAt(len))  ,  len-1) ; 
    }
}
