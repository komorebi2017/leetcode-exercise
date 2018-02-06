


public class Pro206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {


        ListNode printCur = head;
        while (printCur!=null){
            System.out.println(printCur.val);
            printCur = printCur.next;
        }
        System.out.println("-----------------------");
        ListNode pre = null;
        ListNode curr = head;

        while (curr!=null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;

        }

        printCur = pre;
        while (printCur!=null){
            System.out.println(printCur.val);
            printCur = printCur.next;
        }



        return pre;
    }

    public static void main(String[] args) {
        ListNode testHead = null;
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        new Pro206_ReverseLinkedList().reverseList(testHead);
    }


}
