package Inheraitance;

/*-------------------------
 * Hierarchical Inheraitance
---------------------------*/

/* Parent class */
class Animal{
    public void eat(){
        System.out.println("Eatting... (Parent class)");
    }
}

/* Left Child */
class Dog extends Animal{
    public void bhau(){
        System.out.println("Bhau... (Left child class)");
    }
}

/* Right Child */
class Cat extends Animal{
    public void meow(){
        System.out.println("Meow...(Right child class");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        
        /* left child */
        Dog d1 = new Dog();
        d1.eat();
        d1.bhau();

        /* right child */
        Cat c1 = new Cat();
        c1.eat();
        c1.meow();
    }
}
