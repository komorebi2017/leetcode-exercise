public class Pro203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while (cur.next!=null){

            if(cur.next.val == val){
                ListNode delNode  = cur.next;
                cur.next = delNode.next;
            }else {
                cur =cur.next;
            }

        }


        ListNode print = pre.next;
        while (print!=null){
            System.out.print(print.val+" ");
            print = print.next;
        }

        return pre.next;
    }

    public static void main(String[] args) {
        ListNode testHead = null;
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode res = new Pro203_RemoveLinkedListElements().removeElements(head,0);




    }


}
