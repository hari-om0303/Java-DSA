package leet92;

public class leet92 {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node reverseBetween(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        Node prev = null;
        Node curr = head;

        // Step 1: Move curr to the left position
        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        Node last = prev;      // Node before the reversed part
        Node newEnd = curr;    // Node that will become end of the reversed sublist

        Node next = null;
        // Step 2: Reverse nodes between left and right
        for (int i = 0; curr != null && i < right - left + 1; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Connect both parts
        if (last != null) {
            last.next = prev;   // Connect left part to reversed part
        } else {
            head = prev;        // If reversing starts from head
        }

        newEnd.next = curr;     // Connect reversed part to the remaining list

        return head;
    }

    public static void main(String[] args) {
        leet92 list = new leet92();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.print("list => ");
        list.printList();

        list.head = list.reverseBetween(list.head, 2, 4);
        System.out.print("after reverse =  ");
        list.printList();
    }
}
