class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]" , "");
        int len = s.length();
        if( len == 0 ){
            return true  ;
        }
        StringBuilder reversed = new StringBuilder(len);
        int index = 0 ;
        int half = len/2;
        for(int i = len-1 ; index <  half  ; i--){
            if(s.charAt(i) != s.charAt(index)){
                return false;
            }
            index++; 
        }
        return true ; 
    }
}