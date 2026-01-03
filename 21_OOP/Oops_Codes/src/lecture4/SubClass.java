package lecture4;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
//        this.num = num;
//        this.name = name;
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal Kushwaha");
        int n = obj.num;

        System.out.println(obj instanceof Object);
        System.out.println(n);
    }
}