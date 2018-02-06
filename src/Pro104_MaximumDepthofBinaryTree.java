import static sun.swing.MenuItemLayoutHelper.max;

public class Pro104_MaximumDepthofBinaryTree
{
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        return  Math.max(maxDepth(root.left), maxDepth(root.right))+1;
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

        System.out.println(new Pro104_MaximumDepthofBinaryTree().maxDepth(test));

    }



}
