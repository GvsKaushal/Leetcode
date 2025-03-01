package LinkedListProblems;

public class Reverse_Nodes_in_k_Group {

    public static void main(String[] args) {


    }

    private static ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode k_node = null;
        ListNode next_node = null;
        ListNode prev_node = null;

        while (temp != null) {

            k_node = find_k_node(temp, k);

            if (k_node == null) {
                if (prev_node != null) {
                    prev_node.next = next_node;
                }
                return head;
            }

            next_node = k_node.next;
            k_node.next = null;

            reverseList(temp);

            if (temp == head) {
                head = k_node;
                prev_node = temp;
            } else {
                if (prev_node != null) {
                    prev_node.next = k_node;
                    prev_node = temp;
                }
            }
            temp = next_node;
        }

        return head;
    }

    private static ListNode find_k_node(ListNode head, int k) {

        ListNode temp1 = head;

        for (int i = 1; i < k; i++) {
            if (temp1 == null) {
                return null;
            }
            temp1 = temp1.next;
        }
        return temp1;
    }

    private static ListNode reverseList(ListNode head) {

        ListNode before = null;
        ListNode current = head;
        ListNode after;

        while (current != null) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }

        return before;
    }
}
