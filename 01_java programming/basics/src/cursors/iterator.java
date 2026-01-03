package cursors;

import java.util.Iterator;
import java.util.Vector;

public class iterator {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("H");
        v.add("A");
        v.add("R");
        v.add("I");
        v.add("O");
        v.add("M");

        Iterator<String> it = v.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if (s.equalsIgnoreCase("o")) {
                it.remove(); // removes "O" from vector
            } else {
                System.out.print(s);
            }
        }
    }
}
