package package2;
import package1.*;
public class secondfile {
    public static void main(String[] args) {
        firstfile f1 = new firstfile();
        f1.setdata(40,50);
        f1.display();
    }
}
