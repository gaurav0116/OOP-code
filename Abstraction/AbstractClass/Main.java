package Abstraction.AbstractClass;

/*-----------------------------------------------------------
 * Abstruction use Abstract class (it's not pure abstraction)
 -----------------------------------------------------------*/

/* Abstract class - their exest but can't create object of this class */
abstract class Animal{
    abstract void run();    // abstract method - their's body is not delclar

    /* Normal method */
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{
    // this method is compulsery to create because the dog class is extends a abstect class (Animal)
    void run(){
        System.out.println("Dog is run");
    }
}

class Cat extends Animal{
    /* Abstract method (their declaration is compulsiry) */ 
    void run(){
        System.out.println("Cat is run");
    }

    void cry(){
        System.out.println("Cat is crying");
    }
}

public class Main{
    public static void main(String[] args) {
        // Dog obj
        Dog dog = new Dog();
        dog.run();
        dog.eat();

        // Cat obj
        Cat cat = new Cat();
        cat.run();
        cat.cry();

    }
}