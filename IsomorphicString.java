import java.util.*;
public class main{
    public static void(String[] args ){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        boolean value = true;
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2){
            value = false ; 
            return value;
        }
        HashMap<Character , Integer> map1 = new HashMap<>();
        HashMap<Character , Integer> map2 = new HashMap<>();
        for(char ch : s){
            map.put(map.getOrDefault(ch , 0 )+1);
        }
        for(char ch  :t){
            map.put(map.getOrDeafault(ch , 0)+1);
        }
        for(int i = 0 ; i < n ; i++){
            char a1 = s.charAt(i);
            char a2 = t.charAt(i);
            if(map1.value(a1) != map2.value(a2)){
                value = false ;
                return value; 
            }
        }
        return true ; 

    }
}
