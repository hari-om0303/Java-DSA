package lecture2.StaticBlock;

public class Staticblock {
    static int a = 5;
    static int b;

    // will only run once, when the first obj is create i.e. when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a*5;
    }
    public static void main(String[] args) {
       Staticblock obj = new Staticblock();
        System.out.println(Staticblock.a + Staticblock.b);
        System.out.println(Staticblock.a + " " +Staticblock.b);

        Staticblock.b += 3;

        System.out.println(Staticblock.b);

        Staticblock obj2 = new Staticblock();
        System.out.println(Staticblock.a + " " +Staticblock.b);
    }
}
