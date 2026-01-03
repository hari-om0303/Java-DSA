import java.util.Arrays;

public class TestSB {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i=0; i<26; i++){
            s.append((char)('a'+i)+" ");
        }
        System.out.println(s.toString());

        String name = "Hariom";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.indexOf('i'));
        String name2 = "Hari3Om3Gupta";
        System.out.println(Arrays.toString(name2.split("3")));

    }
}
