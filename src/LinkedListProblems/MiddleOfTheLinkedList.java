package LinkedListProblems;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {

        ListNode one = new ListNode();
        one.Append(1);
        one.Append(2);
        one.Append(3);
        one.Append(4);
        one.Append(5);
//        one.Append(6);

        ListNode h = one.head;
        while (h != null) {
            System.out.print(" --> " + h.val);
            h = h.next;
        }

        ListNode result = middleNode(one.head);

        System.out.println();

        while (result != null) {
            System.out.print(" --> " + result.val);
            result = result.next;
        }
    }

    private static ListNode middleNode(ListNode head) {

        ListNode one = head;
        ListNode two = head;  // head.next (even effect)  // head.next.next (odd and even)

        while (two != null && two.next != null) {
            one = one.next;
            two = two.next.next;
        }

        return one;
    }
}