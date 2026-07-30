class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        backtrack(s , result , temp , 0 );      
        return result ;   
    }
    private void backtrack(String s , List<String> result , StringBuilder temp , int index){
        if(temp.length() == s.length()){
            result.add(temp.toString());
            return ; 
        }
        char ch = s.charAt(index);
        if(Character.isLetter(ch)){
            temp.append(Character.toLowerCase(ch));
            backtrack( s , result , temp , index + 1 );
            temp.deleteCharAt(temp.length() -1 );

            temp.append(Character.toUpperCase(ch));
            backtrack(s , result , temp , index +  1);
            temp.deleteCharAt(temp.length() -1 );
        }
        else {
            temp.append(ch);
            backtrack(s , result , temp , index+1);
            temp.deleteCharAt(temp.length() -1 );
        }

    }
    
}