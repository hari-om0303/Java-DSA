package java_generics;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //without java generic
        ArrayList a = new ArrayList<>();
        a.add("hariom");
        a.add(29);
        System.out.println(a);

        //with java generic
        ArrayList<Integer> ad = new ArrayList<>();
//        ad.add("hariom");
        ad.add(29);
        System.out.println(ad);
    }
}
