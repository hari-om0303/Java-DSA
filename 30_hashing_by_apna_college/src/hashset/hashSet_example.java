package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet_example {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        insertinon
        set.add(45);
        set.add(50);
        set.add(20);
        set.add(45);
        set.add(22);

        System.out.println("size of hashset is :" + set.size());

//        search
        if (set.contains(50)){
            System.out.println("element present");
        }

//        delete
        set.remove(45);
        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + ",");
        }

        if (set.isEmpty()){
            System.out.println("set is empty");
        }
    }
}
