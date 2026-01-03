package thread_question;

//ques. = You have to create a program. Have individual classes for Rectangle, Circle.These classes should use inheritance to properly manage the code. Include method, getter, setter for dimension.

class shape{
    int d1 ,d2 ;
    shape(int d1 , int d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    public int getD1(){
        return this.d1;
    }
    public int getD2(){
        return this.d2;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }
}

class circle extends shape{
    circle(int d1){
        super(d1,-1);
    }
    public double area1(){
        return Math.PI*d1*d1;
    }
}

class rect extends shape{
    rect(int d1 ,int d2){
        super(d1 , d2);
    }
    public int area2(){
        return d1*d2;
    }
}
public class main {
    public static void main(String[] args) {
        rect r = new rect(5,5);
        System.out.println("area of rect. is: " + r.area2());
        circle c = new circle(5);
        System.out.println("area of circle is: " + c.area1());
    }
}
