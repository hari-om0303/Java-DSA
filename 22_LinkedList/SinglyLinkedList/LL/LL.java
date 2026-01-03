package LL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertEnd(int value){
        Node node = new Node(value);
        if (tail == null){
            insertFirst(value);
            return;
        }
            tail.next = node;
            tail = node;
        size++;
    }

    public void insertAtRandom(int value , int index) {
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertEnd(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value , temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // Move head to next node
        head = head.next;

        // If head becomes null, that means list had only one node
        if (head == null) {
            tail = null;
        }

        size--;
    }


    public  void deletelast(){
        if (size <= 1){
            deleteFirst();
            return;
        }
      Node secondLast = head;

        while (secondLast.next != tail){
            secondLast = secondLast.next;
        }

        tail = secondLast;
        tail.next=null;

        size--;
    }

    public void deleteAtIndex(int index){
         if (index == 0){
             deleteFirst();
             return;
         }
         if (index == size-1){
             deletelast();
             return;
         }

         Node prev = head;
         for (int i=1; i<index; i++){
             prev  = prev.next;
         }

         prev.next = prev.next.next;
         size--;
    }

    public Node findValue(int index){
        Node nd = head;
        for (int i=0; i<index; i++){
            nd = nd.next;
        }
        return nd;
    }


    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.insertFirst(5);
        list.insertEnd(40);
//        list.insertAtRandom(99,3);
//        list.deleteFirst()
//        list.deletelast();
//        list.deleteAtIndex(3);
        list.display();

        Node n1 = list.findValue(2);
        System.out.println("Node at index 2: " + n1.value);

        Node n2 = list.find(30);
        System.out.println("Node with value 30: " + n2.value);

        Node n3 = list.find(100);
        System.out.println("Node with value 100: " + n3);

    }
}
