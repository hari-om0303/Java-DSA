//public class WrapperClass {
//    public static void main(String[] args) {
//        int a = 525;
//
//        // Wrapping primitive into object
//        Integer wrapped = Integer.valueOf(a);  // Boxing
//        System.out.println("Wrapped object: " + wrapped);
//
//        // Unwrapping object back to primitive
//        int b = wrapped.intValue();  // Unboxing
//        System.out.println("Unwrapped primitive: " + b);
//    }
//}

//public class WrapperClass {
//    public static void main(String[] args) {
//        int x = 10;
//
//        Integer obj = x;    // Autoboxing
//        int y = obj;        // Unboxing
//
//        System.out.println("Object: " + obj);
//        System.out.println("Primitive: " + y);
//
//
//        Integer p = Integer.valueOf("10110",2);
//        System.out.println(p);
//    }
//}
//

class WrapperClass{
    public static void main(String [] args){
        int s = 0;
        for (int i=0; i< args.length ; i++){
            s = s + Integer.parseInt(args[i]);
        }
        System.out.println("avg. is : " + (double)s/args.length );
    }
}