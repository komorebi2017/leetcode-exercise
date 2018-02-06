public class Pro237_DeleteNodeinaLinkedList {

    public void deleteNode(ListNode node) {

        if(node==null) return;
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        new Pro237_DeleteNodeinaLinkedList().deleteNode(node2);

        ListNode printNode = head;
        while (printNode != null){
            System.out.print(printNode.val);
            printNode = printNode.next;
        }
    }






}
