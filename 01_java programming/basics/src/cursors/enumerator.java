package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class enumerator {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add("H");
        v.add("A");
        v.add("R");
        v.add("I");
        v.add("O");
        v.add("M");

        Enumeration k = v.elements();
        while(k.hasMoreElements()){
            System.out.print(k.nextElement());
        }
    }
}
