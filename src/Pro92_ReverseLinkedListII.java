public class Pro92_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count = 0;
        ListNode virtualNode = new ListNode(100);
        virtualNode.next = head;
        ListNode cur = virtualNode;
        ListNode pre = null;
        ListNode preOne = null;
        ListNode nextOne = null;
        while (count <= n){
            while (count <= m-1){
                preOne = cur;
                cur = cur.next;
                count++;
                nextOne = cur;
            }
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            count++;

        }
        preOne.next = pre;
        nextOne.next = cur;
        ListNode pre1 =  virtualNode.next;


        return virtualNode.next;
    }


    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        ListNode testHead = null;
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = new Pro92_ReverseLinkedListII().reverseBetween(head,1,3);
       /* while (res!= null){
            System.out.println(res.val);
            res = res.next;
        }*/
/*
        ListNode print = head;
        while (print!=null){
            System.out.print(print.val);
            print = print.next;
        }
*/


    }
}
