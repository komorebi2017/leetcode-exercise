public class Pro111_MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right !=null){
            return minDepth(root.right)+1;
        }
        if(root.right == null && root.left != null){
            return minDepth(root.left)+1;
        }


        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node1;
        //root.right = node2;
        //node1.left = node3;

        TreeNode test = new TreeNode(0);
        TreeNode test1 = null;
        System.out.println(new Pro111_MinimumDepthofBinaryTree().minDepth(root));

    }


}
