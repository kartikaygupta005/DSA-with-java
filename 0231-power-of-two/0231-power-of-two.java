class Solution {
    public boolean isPowerOfTwo(int n) {
        return recursion(n) ; 
    }
    private static boolean recursion(int n){
        if(n == 1){
            return true ; 
        }
        if(n <= 0 || n%2 != 0 ){
            return false ; 
        }
        return recursion(n/2);
    }
}
