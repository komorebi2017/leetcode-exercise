public class Pro226_InvertBinaryTree {

    public static void swap( TreeNode l, TreeNode r){
        TreeNode temp = l;
        l  = r;
        r = temp;
    }


    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        //swap(root.left,root.right);
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;

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
        new Pro226_InvertBinaryTree().invertTree(root);
        new Pro144_BinaryTreePreorderTraversal().preTraversal(root);

    }




}
