package Inheraitance;

/*-------------------------
 * Multi Level Inheraitance
---------------------------*/

class Animal{
    public void eating(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void Walking(){
        System.out.println("Walking...");
    }
}

class BabyDog extends Dog{
    public void crying(){
        System.out.println("Crying...");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        BabyDog b1 = new BabyDog();
        b1.eating();
        b1.Walking();
        b1.crying();
    }
}
