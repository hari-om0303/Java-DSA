package LL;

public class DLL {

    private Node head ;

    public void insertFirst(int val){
        Node node = new Node(val);
         node.next = head;
         node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLst(int val){
        Node node = new Node(val);
        Node last = head;

        if (head == null){
            node.prev = null;
            head = node;
        }

        while (last.next != null){
            last = last.next;
        }

        node.next = null;
        last.next = node;
        node.prev = last;

    }

    public Node find(int value){
       Node node = head;
       while (node != null){
           if (node.val == value){
               return node;
           }
           node = node.next;
       }
       return null;
    }

    public void insertAtrandom(int after , int val){
       Node p = find(after);

       if (p==null){
           System.out.println("does not exist");
           return;
       }

       Node node = new Node(val);
       node.next = p.next;
       p.next = node;
       node.prev = p;
      if (node.next != null){
          node.next.prev = node;
      }
    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + " <-> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print IN Reverse");
        while (last != null){
            System.out.print(last.val + " <-> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int val;
        private Node prev;
        private Node next;

        public  Node(int val){
            this.val = val;
        }

        public  Node(int val, Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public static void main(String[] args) {
      DLL list = new DLL();
      list.insertFirst(20);
      list.insertFirst(15);
      list.insertFirst(10);
      list.insertFirst(5);
      list.insertLst(30);
      list.insertAtrandom(30,35);
      list.display();
    }
}
