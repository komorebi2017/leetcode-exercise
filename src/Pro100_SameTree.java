public class Pro100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        else if(p==null && q!=null)  return false;
        else if(p!=null && q==null)    return false;
        if(p.val ==q.val){
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }else
            return false;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        root.left = node1;
        node1.left= node2;
        node2.left= node3;
        node3.left = node4;


        TreeNode root1 = new TreeNode(5);
        TreeNode node11 = new TreeNode(4);
        TreeNode node21 = new TreeNode(1);
        TreeNode node31 = new TreeNode(2);
        TreeNode node41 = new TreeNode(3);
        root1.left = node11;
        node11.left= node21;
        node21.left= node31;
        node31.left = node41;



        TreeNode test = new TreeNode(0);
        test.left = node2;
        System.out.println(new Pro100_SameTree().isSameTree(root,root1));

    }


}
