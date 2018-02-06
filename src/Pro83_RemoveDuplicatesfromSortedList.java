public class Pro83_RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        if(head ==null) return null;
        ListNode cur = head;
        int value = head.val;
        while (cur.next !=null){

            if(cur.next.val == value){
                ListNode delNode = cur.next;
                cur.next = delNode.next;
            }   else {
                value = cur.next.val;
                cur = cur.next;
            }

        }

        ListNode printCur = head;
        while (printCur!=null){
            System.out.print(printCur.val+ " ");
            printCur = printCur.next;
        }
        return head;
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
       ListNode res = new Pro83_RemoveDuplicatesfromSortedList().deleteDuplicates(head);




    }


}
