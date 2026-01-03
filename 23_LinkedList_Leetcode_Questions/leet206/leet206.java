package leet206;


public class leet206 {

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

    public void reverseList() {
         if (size<2){
             return;
         }
         Node prev = null;
         Node pres = head;
         Node next = null;
         while (pres != null){
             next = pres.next;
             pres.next = prev;
             prev = pres;
             pres = next;
         }

         head = prev;
    }

    public static void main(String[] args) {
        leet206 list = new leet206();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.print("list => ");
        list.printList();

       list.reverseList();
       list.printList();

    }

}
