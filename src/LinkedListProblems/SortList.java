package LinkedListProblems;

public class SortList {

    public static void main(String[] args) {

        ListNode one = new ListNode();
        one.Append(-1);
        one.Append(5);
        one.Append(3);
        one.Append(4);
        one.Append(0);

        ListNode h = one.head;
        while (h != null) {
            System.out.print(" --> " + h.val);
            h = h.next;
        }

        ListNode result = sortList(one.head);

        System.out.println();

        while (result != null) {
            System.out.print(" --> " + result.val);
            result = result.next;
        }

    }

    private static ListNode sortList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode middle = middle(head);

        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);


        return merge(leftHead, rightHead);
    }

    private static ListNode merge(ListNode leftHead, ListNode rightHead) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (leftHead != null && rightHead != null) {

            if (leftHead.val < rightHead.val) {
                ListNode temp = new ListNode(leftHead.val);
                curr.next = temp;
                curr = temp;
                leftHead = leftHead.next;
            } else {
                ListNode temp = new ListNode(rightHead.val);
                curr.next = temp;
                curr = temp;
                rightHead = rightHead.next;
            }
        }
        while (leftHead != null) {

            ListNode temp = new ListNode(leftHead.val);
            curr.next = temp;
            curr = temp;
            leftHead = leftHead.next;

        }
        while (rightHead != null) {

            ListNode temp = new ListNode(rightHead.val);
            curr.next = temp;
            curr = temp;
            rightHead = rightHead.next;

        }
        return dummy.next;
    }

    private static ListNode middle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
