import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        subset("","abc");
        System.out.println((subsets("", "abc")));
        System.out.println((subsetwithAssci("", "abc")));
    }
    static void subset(String p, String up){
        if (up.isEmpty()){
            System.out.println(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subset(p,up.substring(1));
        subset(p+ch, up.substring(1));
    }

    static ArrayList<String> subsets(String p, String up){
        if (up.isEmpty()){
          ArrayList<String> list = new ArrayList<>();
          list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsets(p+ch, up.substring(1));
        ArrayList<String> right = subsets(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subsetwithAssci(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subsets(p+ch, up.substring(1));
        ArrayList<String> second = subsets(p, up.substring(1));
        ArrayList<String> third = subsets(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
