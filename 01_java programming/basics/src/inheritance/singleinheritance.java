package inheritance;
public class singleinheritance {
    public static void main(String[] args) {
        nokia1 n1 = new nokia1();
        nokia2 n2 = new nokia2();
        n2.display();
        n2.setdata();
    }
}
//   base/parent/super  class
class nokia1{
    int mic=1 ;
    int speaker=2  ;
    int radio =1 ;
    void setdata(){
        System.out.println("nokia1 function setdata executed");
        System.out.println(mic);
    }
    void display(){
        System.out.println("nokia1 function display executed");
    }
}

//    derived/child/sub clss
class nokia2 extends nokia1 {
    int sensor ;
    int music ;
    void f1(){
        System.out.println("nokia2 f1 executed");
    }
    void f2(){
        System.out.println("nokia2 f2 executed");
    }

}
