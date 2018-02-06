import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;

public class Pro236_LowestCommonAncestor_of_a_BinaryTree {


/*236.二叉树的最低公共祖先
给定一个二叉树，找到树中两个给定节点的最低共同祖先（LCA）。

根据维基百科LCA的定义：“最低公共祖先定义在两个节点v和w之间，作为T中具有v和w作为后代（我们允许一个节点成为其后代）的最低节点。 ”

        _______3______
       / \
    ___5__ ___1__
   / \ / \
   6 _2 0 8
         / \
         7 4
例如，最低的共同祖先（LCA）的节点5和1是3。另一个例子是节点的LCA 5和4是5，由于节点可以根据LCA定义是自身的后代。*/


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


  /*后序遍历二叉树，假设当前节点为cur，先处理了cur的两棵子树
  * 假设处理cur的左子树时返回节点为left，处理cur右子树时返回节点为right
  *
  * 1.cur==null|| cur==p|| cur==q  return cur;
  * 2.left==null && right==null , 说明cur的整棵子树都没有发现p,q, return null;
  * 3.left!=null && right!=null , 说明p,q向上过程中，首次在cur相遇， return cur;
  * 4.left,right有一个为空，不空的节点node有两种情况：
  *     ①node是p或q中的一个
  *     ②node已经是p,q的最近公共祖先
  *     直接返回node*/
    public static  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root ==null||root ==p || root==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p ,q);
        if(left!=null&&right!=null){
            return root;
        }
        return left!=null?left:right;

    }
    /*进阶方式是建立一种记录，每次查询可以完全根据记录查询
    *
    * 进阶一：
    * 建立每个节点对应的父节点信息，哈希表
    * 建立过程时间复杂度O(N)，空间复杂度O(N)
    * 查询操作时间复杂度O(h)
    *
    * 进阶二：
    * 直接建立任意两个节点的最近公共祖先
    * 建立过程时间复杂度O(N^2)，空间复杂度O(N^2)
    * 查询操作时间复杂度O(1)*/

    public static class Advanced_First{
        private HashMap<TreeNode,TreeNode> map;

        public Advanced_First(TreeNode head){
            map = new HashMap<TreeNode,TreeNode>();
            if(head!= null){
                map.put(head, null);
            }
            setMap(head);
        }

        private void setMap(TreeNode head){
            if (head ==null){
                return;
            }if (head.left != null){
                map.put(head.left,head);
            }if (head.right != null){
                map.put(head.right, head);
            }
            setMap(head.left);
            setMap(head.right);
        }

        public TreeNode doAdvancedFirst(TreeNode o1, TreeNode o2){
            HashSet<TreeNode> path = new HashSet<TreeNode>();
            while (map.containsKey(o1)){
                path.add(o1);
                o1 = map.get(o1);
            }
            while (!path.contains(o2)){
                path.add(o2);
                o2 = map.get(o2);
            }
            return o2;

        }

    }

   /* public static class Advanced_Second{
        private HashMap<TreeNode,HashMap<TreeNode,TreeNode>> map;

        public Advanced_Second(TreeNode head){
            map = new HashMap<TreeNode,HashMap<TreeNode, TreeNode>>();
            initMap(head);
            setMap(head);
        }

        private void initMap(TreeNode head){
            if(head == null){
                return;
            }
            map.put(head, new HashMap<TreeNode, TreeNode>());
            initMap(head.left);
            initMap(head.right);
        }

        private void setMap(TreeNode head){
            if (head==null){
                return;
            }

        }


    }*/




}

