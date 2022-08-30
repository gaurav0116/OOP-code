package Inheraitance;

/*------------------------- 
* Single Level Inheraitance 
--------------------------*/

/* Parent class */
class  Shape{
    public void area(){
        System.out.println("display area (Parent class)");
    }
}

/* Child class */
class Tringle extends Shape{
    public void name(){
        System.out.println("It is tringle (Child Class)");
    }
}

public class SingelLevel {
    public static void main(String[] args) {
        Tringle t1 = new Tringle();
        t1.area();
        t1.name();
    }
}
