package LinkedListProblems;

public class Add_1 {

    public static void main(String[] args) {

        Node one = new Node(9);
//        Node two = new Node(5);
//        Node three = new Node(6);

//        one.next = two;
//        two.next = three;

        Node result = addOne(one);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    public static Node addOne(Node head) {

        Node newhead = reverseList(head);
        Node temp = newhead;

        Node pre = temp;

        int carry = 1;

        while (temp != null) {

            int sum = 0;

            if (temp != null) {
                sum = sum + temp.data;
                sum = sum + carry;
                temp.data = sum % 10;
                carry = sum / 10;
            }
            pre = temp;
            temp = temp.next;

        }

        if (carry != 0) {
            Node newnode = new Node(carry);
            pre.next = newnode;
        }

        return reverseList(newhead);

    }

    private static Node reverseList(Node head) {

        Node before = null;
        Node current = head;
        Node after;

        while (current != null) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }

        return before;
    }
}
