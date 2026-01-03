package leet61;

public class leet61 {

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

    public Node rotateRight(Node head, int k) {
        if (k<= 0 || head == null || head.next == null){
            return head;
        }
         Node last = head;
        int len = 1;
        while (last.next != null){
            last = last.next;
            len++;
        }
        last.next = head;
        int rotation = k%len;
        int skip = len - rotation;
        Node newlast = head;

        for (int i=0 ; i<skip-1; i++){
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
    }



    public static void main(String[] args) {
        leet61 list = new leet61();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.print("list => ");
        list.printList();

      list.head =  list.rotateRight(list.head , 3);
        list.printList();


    }
}
