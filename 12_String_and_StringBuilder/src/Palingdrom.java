public class Palingdrom {
    public static void main(String[] args) {
        String s = "abcdcba";
        System.out.println(ispaling(s));
    }
    static boolean ispaling(String s){
        for (int i=0; i<=s.length()/2; i++){
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
