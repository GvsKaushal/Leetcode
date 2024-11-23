package LinkedListProblems;

public class ListNode {

    int length=0;
    int val;
    ListNode next;
    ListNode head;
    ListNode tail;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void Append(int val) {
        ListNode newnode = new ListNode(val);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = tail.next;
        }
        length++;
    }
}
