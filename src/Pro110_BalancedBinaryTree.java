public class Pro110_BalancedBinaryTree {


    /*提交后递归栈溢出*/


    public int getHeight(TreeNode root){
        if(root ==null)  return 0;
        return Math.max(getHeight(root.left),getHeight(root.right)+1);

    }


    public boolean isBalanced(TreeNode root) {

        if(root==null) return true;
        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1){
            return false;
        }else
            return isBalanced(root.left)&&isBalanced(root.right);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        //TreeNode node3 = new TreeNode(3);
        //TreeNode node4 = new TreeNode(4);
        root.right = node1;
        node1.right = node2;
        //node1.left = node3;
        //node3.left = node4;

        System.out.println(new Pro110_BalancedBinaryTree().isBalanced(root));

    }


}
