public class Remove_a {
    public static void main(String[] args) {
        remove1("", "baccad");
        System.out.println(remove2("baccad"));
    }
    static void remove1(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            remove1(p,up.substring(1));
        }else {
            remove1(p+ch, up.substring(1));
        }
    }

    static String remove2(String up){
        if (up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            return remove2(up.substring(1));
        }else {
            return ch+remove2(up.substring(1));
        }
    }
}
