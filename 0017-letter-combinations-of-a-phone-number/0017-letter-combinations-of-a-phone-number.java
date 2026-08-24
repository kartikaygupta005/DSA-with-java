class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0 ){
            return result ; 
        }
        Map<Character , String> digitsToLetters = new HashMap<>();
        digitsToLetters.put('2',"abc");
        digitsToLetters.put('3',"def");
        digitsToLetters.put('4',"ghi");
        digitsToLetters.put('5',"jkl");
        digitsToLetters.put('6',"mno");
        digitsToLetters.put('7',"pqrs");
        digitsToLetters.put('8',"tuv");
        digitsToLetters.put('9',"wxyz");
        backtrack(digits ,  0 , new StringBuilder() , result , digitsToLetters);
        return result ;
    }
    private void backtrack(String digits , int index , StringBuilder Combination , List<String> result , Map<Character , String > digitsToLetters){
        if(index == digits.length()){
            result.add(Combination.toString());
            return;
        }
        String Letters = digitsToLetters.get(digits.charAt(index));
        for(char letter : Letters.toCharArray()){
            Combination.append(letter);
            backtrack(digits ,  index+1 , Combination , result , digitsToLetters);
            Combination.deleteCharAt(Combination.length()-1);
        }
    } 
}