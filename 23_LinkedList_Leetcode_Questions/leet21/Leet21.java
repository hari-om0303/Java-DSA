package leet21;

public class Leet21 {
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


    public Leet21 mergeTwoLists(Leet21 list1, Leet21 list2) {
            Node f = list1.head;
            Node s = list2.head;

            Leet21 ans = new Leet21();

            while (f != null && s != null){
                if (f.val < s.val){
                    ans.insertLast(f.val);
                   f=f.next;
                }else {
                    ans.insertLast(s.val);
                    s=s.next;
                }
            }

            while (f != null){
                ans.insertLast(f.val);
                f = f.next;
            }
            while (s != null){
                ans.insertLast(s.val);
                s = s.next;
            }

   return ans;
   }

    public static void main(String[] args) {
   Leet21 list1 = new Leet21();
   list1.insertLast(1);
   list1.insertLast(2);
   list1.insertLast(4);

        System.out.print("list1 = ");
        list1.printList();

   Leet21 list2 = new Leet21();
   list2.insertLast(1);
   list2.insertLast(3);
   list2.insertLast(4);

        System.out.print("list2 = ");
        list2.printList();

   Leet21 mergedList = new Leet21().mergeTwoLists(list1 ,list2);
        System.out.print("mergerList = ");
   mergedList.printList();
    }

}