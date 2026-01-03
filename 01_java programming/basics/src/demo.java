class constructor{
    int x ,y ;
    //constructor

    constructor(){
        System.out.println("const.1 executed");
    }
    void fun1(){
        System.out.println("fun1 executed");
    }
}

class demo {
    public static void main(String[] args) {
        constructor c  = new constructor();
        c.fun1();

    }
}
