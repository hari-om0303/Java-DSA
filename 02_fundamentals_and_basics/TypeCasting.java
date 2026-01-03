public class TypeCasting {
    public static void main(String[] args) {
//typecasting
        int num = (int) (67.45f);
        System.out.println(num);

//        automatic type promomtion in expression
        int a = 260;
        byte b = (byte)(a);  //260%256 = 4
        System.out.println(b);

        byte p =  40;
        byte q =  60;
        byte r =  30;
        int  s =  ((p*q)/r);
        System.out.println(s);

        int number = 'A';
        int numb = 'a';
        System.out.println(number);
        System.out.println(numb);

    }
}
