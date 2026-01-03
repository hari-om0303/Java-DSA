package leet142;

public class leet142 {

    private leet142.Node head;
    private leet142.Node tail;
    private int size;

    private class Node{
        int val;
        leet142.Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, leet142.Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        leet142.Node node = new leet142.Node(val);
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
        leet142.Node node = new leet142.Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void printList() {
        leet142.Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public Node StartCycle(Node head) {

        if (head== null && head.next == null) return null;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
            Node start = head;
               while (start != slow){
                   start = start.next;
                   slow = slow.next;
               }
               return start;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        leet142 list = new leet142();
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(0);
        list.insertLast(-4);

        System.out.print("list");
        list.printList();

        // Manually create a cycle like LeetCode's "pos = /1"
        // tail -> node at index 1 (value = 3)
        list.tail.next = list.head.next;  // makes a cycle

//        int result = list.StartCycle(list.head);
//        System.out.println(result);

        Node startcycle = list.StartCycle(list.head);
        System.out.println(startcycle.val);

    }

}
