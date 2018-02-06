public class Pro25_ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)    return null;
        ListNode virtualHead = new ListNode(100);
        virtualHead.next = head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode preNode = virtualHead;

        int count = 1;
        while (fast != null){
            System.out.println("fast:"+fast.val+ "count:"+count);
            if(count == k){
                ListNode nextNode = fast.next;
                reversePart(preNode, slow, fast.next, nextNode);
                count = 0;
                slow = nextNode;
                fast = nextNode;
                preNode = nextNode;
            }if(fast!=null){
                fast = fast.next;
                count++;
            }

        }

        return virtualHead.next;
    }

    public static void reversePart(ListNode pre, ListNode start, ListNode end, ListNode next){
//        System.out.println("Into Resver! "+ start.val +" "+ end.val);
        ListNode preNode = null;
        ListNode curNode = start;
        while (curNode != end){
            System.out.println(curNode.val);
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
         //   System.out.println("preNode:"+ preNode.val);
        }
       /* System.out.println("start:"+ start.val);
        System.out.println("curNode:"+ curNode.val);
        System.out.println("preNode:"+ preNode.val);
*/
        pre.next = preNode;
        start.next = next;

        ListNode printNode = pre;

        while (printNode != next){
            System.out.print(printNode.val+" ");
            printNode = printNode.next;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode printNode = (new Pro25_ReverseNodesinkGroup().reverseKGroup(head,2));

        while (printNode != null){
            System.out.print(printNode.val);
            printNode = printNode.next;
        }
    }
}
