package Demo;
import Accessmodifiers.*;

class Student{
    static String clg;
}

public class Demo extends Proctected_modifier {
    public static void main(String[] args) {
        Demo s = new Demo();
        s.print();

        Student.clg = "GEC";
        System.out.println(Student.clg);
    }
}
