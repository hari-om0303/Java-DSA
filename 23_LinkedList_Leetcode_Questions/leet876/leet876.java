package leet876;


public class leet876 {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
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

    public Node middleNode(Node head) {
            Node f = head;
            Node s = head;

            while (f != null && f.next != null){
                s = s.next;
                f = f.next.next;
            }
            return s;
    }


    public static void main(String[] args) {
        leet876 list = new leet876();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.print("list");
        list.printList();

        Node mid = list.middleNode(list.head);
        System.out.println(mid.val);

    }

}
