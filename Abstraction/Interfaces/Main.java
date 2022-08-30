package Abstraction.Interfaces;

/*-----------------------------------------------
 * Abstraction using Interface (Pure Abstraction)
 -----------------------------------------------*/

/* Animal interface (pure abstraction) */
 interface Animal{
    int eye = 2;
    public void eat();
 }

 class Dog implements Animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
 }

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println("Dog have " + d1.eye + " eyes");
        d1.eat();
    }
}
