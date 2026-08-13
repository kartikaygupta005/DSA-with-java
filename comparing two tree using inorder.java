class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        inorder(p, result1);
        inorder2(q , result2);
        int length1 = result1.size();
        int  length2 = result2.size();
        if(length1 != length2 ){
            return false ;
        }
        for(int i = 0 ; i  < length1 ; i++){
            if(!Objects.equals(result1.get(i),(result2.get(i)))){
                return false;
            }
        }
        return true ; 
    }
    public static void inorder(TreeNode p ,  List<Integer> result1){
        if(p == null){
            result1.add(null);
            return ;
            }

        inorder(p.left , result1);
        result1.add(p.val );
        inorder(p.right , result1); 
        
    }
    public static void inorder2(TreeNode q , List<Integer> result2){
        if(q == null){
            result2.add(null);
            return;
        }
        inorder2(q.left , result2);
        result2.add(q.val);
        inorder2(q.right , result2) ;
    }
}
