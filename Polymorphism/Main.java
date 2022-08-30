package Polymorphism;

class Student{
    String name;
    int age;

    /*-----------------------------------------------
     * Compile time Polymorphsim (Method overloading)
     -----------------------------------------------*/
    void printInfo(String name){
        System.out.println(name);
    }

    void printInfo(int age){
        System.out.println(age);
    }

    void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Gaurav";
        s1.age=21;

        //  Polymorphism (method overloading) 
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}
