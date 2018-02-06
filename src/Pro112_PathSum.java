public class Pro112_PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null)    return false;

        if(root.left == null && root.right == null)
            return sum == root.val;
        /*
        if(root.left==null&&sum == root.val){
            return true;
        }
        if(root.right==null&&sum == root.val){
            return true;
        }*/
            return hasPathSum(root.left, sum-root.val)
                || hasPathSum(root.right, sum-root.val);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;

        TreeNode test = new TreeNode(0);

        System.out.println(new Pro112_PathSum().hasPathSum(root,3));
    }

}
