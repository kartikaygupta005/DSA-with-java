class Solution {

    int ans = 0 ;

    class Info {
        boolean isBST;
        int min;
        int max;
        int sum;

        Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    public int maxSumBST(TreeNode root) {
        postOrder(root);
        return ans;
    }

    private Info postOrder(TreeNode root) {
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE,
                            Integer.MIN_VALUE, 0);
        }

        Info left = postOrder(root.left);
        Info right = postOrder(root.right);
        if (left.isBST && right.isBST &&
            left.max < root.val &&
            root.val < right.min) {
            int sum = left.sum + right.sum + root.val;
            ans = Math.max(ans, sum);
            int min = Math.min(root.val, left.min);
            int max = Math.max(root.val, right.max);
            return new Info(true, min, max, sum);
        }
        return new Info(false, 0, 0, 0);
    }
}