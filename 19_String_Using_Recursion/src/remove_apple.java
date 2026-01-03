public class remove_apple {
    public static void main(String[] args) {
        System.out.println(remove1( "Haribacapplecad"));

    }
    static String remove1( String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
          return   remove1(up.substring(5));
        }else {
          return  up.charAt(0) + remove1(up.substring(1));
        }
    }
}
