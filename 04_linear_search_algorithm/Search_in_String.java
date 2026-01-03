public class Search_in_String {
    public static void main(String[] args) {
        String str = "Hariom";
        char trg = 'h';
        System.out.println(Search(str,trg));
    }
    static boolean Search(String str, char trg){
        for (int i=0; i<str.length(); i++){
            if(trg == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
