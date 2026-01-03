package this_and_super_keywords;

public class thiss {
    public static void main(String[] args) {
    example e = new example();
    e.f1(5,6);
        e.display();
        e.f2(10,23);
    e.display();
    }
}

class example {
    int x ,y;
    void f1(int p , int q ){
        this.x = p;
        this.y = q;
    }
    void f2(int p ,int q){
        x = p;
        y = q;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}