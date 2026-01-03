interface greet{
    void sayhello();
}

public class anonymous_Class {
    public static void main(String[] args) {
        greet g = new greet() {
            @Override
            public void sayhello() {
                System.out.println("hello , this is anonymous class example");
            }
        };
            g.sayhello();
    }
}
