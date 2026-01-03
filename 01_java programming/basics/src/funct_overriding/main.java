package funct_overriding;

public class main {
    public static void main(String[] args) {
     Parent p = new Parent();
     p.show();
     Child c = new Child();
     c.show();
    }
}

class Parent {
    void show() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is Child class");
    }
}
