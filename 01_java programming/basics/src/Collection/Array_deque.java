package Collection;

import java.util.ArrayDeque;

public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(4);
        a1.add(8);
        a1.add(12);
        a1.addFirst(2);

        System.out.println(a1);
    }
}
