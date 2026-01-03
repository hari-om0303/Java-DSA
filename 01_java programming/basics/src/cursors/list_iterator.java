package cursors;

import java.util.ListIterator;
import java.util.Vector;

public class list_iterator {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add("H");
        v.add("A");
        v.add("R");
        v.add("I");
        v.add("O");
        v.add("M");

        ListIterator l = v.listIterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
    }
}
