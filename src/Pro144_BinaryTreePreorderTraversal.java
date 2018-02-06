import java.util.ArrayList;
import java.util.List;

public class Pro144_BinaryTreePreorderTraversal {
    private  List<Integer> res = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preTraversal(root);
        return res;
    }

    public void preTraversal(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        res.add(root.val);
        preTraversal(root.left);
        preTraversal(root.right);
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

        new Pro144_BinaryTreePreorderTraversal().preTraversal(root);

    }






}
