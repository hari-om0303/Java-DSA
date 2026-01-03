package lecture1;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
//        int[] numbers = new int[5];
//
//        // store 5 names
//        String[] names = new String[5];
//
//        // data of 5 students: {roll no, name, marks}
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

//        lecture2.Student[] students = new lecture2.Student[5];

//        // just declaring
        Student kunal = new Student();

//        lecture2.Student kunal = new lecture2.Student(15, "Kunal Kushwaha", 85.4f);
//        lecture2.Student rahul = new lecture2.Student(18, "Rahul Rana", 90.3f);
//        System.out.println(rahul.name);

//        kunal.rno = 13;
//        kunal.name = "Kunal Kushwaha";
//        kunal.marks = 88.5f;


//        kunal.changeName("Shoe lover");
//        kunal.greeting();

//
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to lecture5.lecture5.access.access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new lecture2.Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


//     lecture2.Student arpit = new lecture2.Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
//        rno = rno;
//        name = name;
//        marks = marks;
    }

}
