package leet143;

public class leet143 {

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

    public void reorderList(Node head) {
            Node mid = Mid(head);
            Node secondhead = reverseList(mid);
            Node firsthead = head;

            if (firsthead == null || secondhead == null){
                return;
            }

            while (firsthead != null && secondhead != null){
                Node temp = firsthead.next;
                firsthead.next = secondhead;
                firsthead = temp;

                temp = secondhead.next;
                secondhead.next = firsthead;
                secondhead = temp;
            }

            if (firsthead != null ){
                firsthead.next = null;
            }
    }

    public Node Mid(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }



    public static void main(String[] args) {
        leet143 list = new leet143();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.print("list => ");
        list.printList();

        list.reorderList(list.head);
        list.printList();


    }
}
