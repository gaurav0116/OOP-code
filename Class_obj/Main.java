package Class_obj;

class Animal{
    // properties 
    String name;    // Animal name
    String type;    // Animal type
    int lags;   // no of lags

    // methods
    void eatting (){
        System.out.println( this.name + " is eatting.");
    }

}

public class Main{
    public static void main(String[] args) {

        // Create object of Animal class
        Animal a1 = new Animal();
        a1.name="cat";
        a1.type="streat animal";
        a1.eatting();

        // 2nd obj
        Animal a2 = new Animal();
        a2.name="lion";
        a2.type="forest animal";
        a2.eatting();
    }
}
