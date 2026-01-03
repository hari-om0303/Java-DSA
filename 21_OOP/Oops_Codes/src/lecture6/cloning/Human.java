package lecture6.cloning;
import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy
        return super.clone();
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is deep copy
//        Human twin = (Human)super.clone(); // this is actually shallow copy
//
//        // make a deep copy
//        twin.arr = new int[twin.arr.length];
//        for (int i = 0; i < twin.arr.length; i++) {
//            twin.arr[i] = this.arr[i];
//        }
//        return twin;
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(34, "Kunal Kushwaha");
//        Human twin = new Human(kunal);

        Human twin = (Human)kunal.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
//
        twin.arr[0] = 100;
//
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));
    }

}