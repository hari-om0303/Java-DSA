package Collection;
import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.remove(2);

        l2.add(5);
        l2.add(6);

        System.out.println(l1);
        System.out.println(l1.contains(3));
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l1.indexOf(3));
        System.out.println(l1.indexOf(4));

    }
}
