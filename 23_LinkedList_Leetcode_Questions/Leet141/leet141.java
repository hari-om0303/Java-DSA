package Leet141;


public class leet141 {

    private leet141.Node head;
    private leet141.Node tail;
    private int size;

    private class Node{
        int val;
        leet141.Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, leet141.Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        leet141.Node node = new leet141.Node(val);
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
        leet141.Node node = new leet141.Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void printList() {
        leet141.Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public boolean hasCycle(Node head) {
         Node fast = head;
         Node slow = head;

         while (fast != null && fast.next != null){
             fast = fast.next.next;
             slow = slow.next;
             if (fast == slow){
                 return true;
             }
         }
         return false;
    }


    public int CycleLength(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        leet141 list = new leet141();
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

       boolean result = list.hasCycle(list.head);
        System.out.println(result);

         int length = list.CycleLength(list.head);
        System.out.println(length);
    }

}
