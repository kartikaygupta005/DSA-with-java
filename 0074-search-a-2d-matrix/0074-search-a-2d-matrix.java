class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int rows = 0; rows < matrix.length ; rows++){
            for(int columns = 0 ; columns < matrix[0].length ; columns++){
                if (target == matrix[rows][columns]){
                    return true ;
                }
            }
        }
        return false ;
    }
}