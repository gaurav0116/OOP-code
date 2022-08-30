package Constructor;

class Student1{
    String name;
    int age;

    void printInfo(){
        System.out.println("Name is " + this.name + " Age is " + this.age);
    }

    /*----------None perameteris constructor----------*/
    Student1(){
        System.out.println("Default Constructor called");
    }
}

class Student2{
    String name;
    int age;

    void printInfo(){
        System.out.println("Name is " + this.name + " Age is " + this.age);
    }

    /*----------Parameteris constructor----------*/
    Student2(String name, int age){
        System.out.println("parameterise constructor called");
        this.name=name;
        this.age=age;
    }
}

class Student3{
    String name;
    int age;

    void printInfo(){
        System.out.println("Name is " + this.name + " Age is " + this.age);
    }

    /*----------Copy constructor----------*/
    Student3(Student1 s1){
        System.out.println("Copy constructor called");
        this.name = s1.name;
        this.age = s1.age;
    }
}

public class Main {
    public static void main(String[] args) {
        /*----------default constructor----------*/
        Student1 s1 = new Student1();     
        s1.name = "Gaurav";
        s1.age = 21;
        s1.printInfo();
        System.out.println();

        /*----------parameterise constructor----------*/
        Student2 s2 = new Student2("Ankit", 20);    
        s2.printInfo();
        System.out.println();

        /*----------Copy constructor----------*/
        Student3 s3 = new Student3(s1);
        s3.printInfo();
    }
}
