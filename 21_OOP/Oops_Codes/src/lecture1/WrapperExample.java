package lecture1;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";   // ✅ Allowed
        System.out.println(kunal.name);
        System.out.println(kunal);

//        If kunal is final → ❌ you cannot write kunal = null;.
//        If kunal is not final → ✅ you can write kunal = null;


        // when a non primitive is final, you cannot reassign it.
//        kunal = new lecture2.A("new object");

        A obj = new A("Rnadvsjhv");
        System.out.println(obj.name);
        System.out.println(obj);

//        to remove reference
        obj = null;




//        for (int i = 0; i < 1000000000; i++) {
//            obj = new lecture2.A("Random name");
//        }

           System.gc();   // request garbage lecture7.collection
        System.out.println("End of main");

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed" + " "+ name);
    }
}