public class Pro101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        else if(left == null&&right != null)    return false;
        else if(left != null &&right == null)      return false;
        else{
            if(left.val == right.val){
                return isSame(left.left,right.right)&&isSame(left.right,right.left);
            }
            else return false;
        }

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        //TreeNode node3 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;


        node2.left = node5;
        node2.right = node6;

        TreeNode test = new TreeNode(0);
        System.out.println(new Pro101_SymmetricTree().isSymmetric(root));

    }

}
