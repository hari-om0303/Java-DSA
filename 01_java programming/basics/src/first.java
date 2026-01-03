import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
    class fun {
    int x ;
    private  static  int y;
    void fun1(){
        y=22;
    }
    void fun2(){
        System.out.println(y);
    }
    void fun3(){
        y=45;
    }
    }
    class first{
    public static void main(String [] args){
        fun f1 = new fun();
        fun f2 = new fun();
        f1.fun1();
        f2.fun3();
        f1.fun2();
    }
    }