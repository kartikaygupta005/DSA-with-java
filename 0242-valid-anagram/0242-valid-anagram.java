class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS  = s.length();
        int lenT = t.length();
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        if(lenS != lenT){
            return false;
        }
        else{
            Arrays.sort(charArrayS);
            Arrays.sort(charArrayT);
            return Arrays.equals(charArrayS,charArrayT);
        }

        
    }
}