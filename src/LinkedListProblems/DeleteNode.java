package LinkedListProblems;

public class DeleteNode {

    public static void main(String[] args) {

        ListNode one = new ListNode();
        one.Append(4);
        one.Append(5);
//        one.Append(1);
//        one.Append(9);


        ListNode h = one.head;
        while (h != null) {
            System.out.print(" --> " + h.val);
            h = h.next;
        }

        deleteNode(one.head.next);

        System.out.println();

        h = one.head;
        while (h != null) {
            System.out.print(" --> " + h.val);
            h = h.next;
        }

    }

    private static void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        temp.next = null;
    }
}
