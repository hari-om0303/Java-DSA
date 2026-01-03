package Collection;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>();
        LinkedList <Integer> l2 = new LinkedList<>();

        l1.add(5);
        l1.add(10);
        l1.add(15);

        l2.add(20);
        l2.add(25);
        l2.add(30);

        System.out.println(l1);
        System.out.println(l2);
        l1.addAll(l2);
        l1.addAll(0,l2);
        System.out.println(l1);

        l1.set(1,566);
        System.out.println(l1);

        for (int i=0 ; i<l1.size() ; i++){
            System.out.println(l1.get(i));
        }
    }
}
