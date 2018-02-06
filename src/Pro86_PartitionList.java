public class Pro86_PartitionList {

    public ListNode partition(ListNode head, int x) {
        if(head == null)    return null;
        ListNode virtualHead =new ListNode(100);
        ListNode virtualMore =  new ListNode(200);
        ListNode less = virtualHead;
        ListNode more = virtualMore;
        ListNode curNode = head;
        while (curNode!=null){
            if(curNode.val < x){
                less.next = curNode;
                less = less.next;
                System.out.println(less.val);

            }else {
                more.next = curNode;
                more = more.next;
                System.out.println(more.val);
            }
            curNode = curNode.next;
        }
        less.next = virtualMore.next;
        more.next = null;
        return virtualHead.next;
    }

   /* public ListNode partition(ListNode head, int x) {
        if(head ==null) return null;
        ListNode virtualNode = new ListNode(x-1);
        virtualNode.next = head;
        ListNode lessLast = virtualNode;
        while (lessLast.next.val<x){
            lessLast = lessLast.next;
        }
        ListNode cur = lessLast.next;
        while (cur.next!= null){
            if(cur.next.val < x){
                ListNode move = cur.next;
                ListNode moreFirst = lessLast.next;
                lessLast.next = move;
                cur.next = move.next;
                move.next = moreFirst;
                lessLast = lessLast.next;
            }else {
                cur =cur.next;
            }
        }
        return virtualNode.next;
    }*/

    public static void main(String[] args) {
        ListNode testhead = null;
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(2);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode printNode = new Pro86_PartitionList().partition(head,5);

        while (printNode != null){
            System.out.print(printNode.val);
            printNode = printNode.next;
        }
    }





}
