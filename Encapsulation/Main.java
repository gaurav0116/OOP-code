package Encapsulation;

/* Encapsulate class */
class Employee{
    private String name;
    private String password;

    /* Read name */
    String getName(){
        return this.name;
    }
    /* Write name */
    void setName(String name){
        this.name = name;
    }

    /* Read Password */
    String getPass(){
        return this.password;
    }
    /* Write Password */
    void setPass(String pass){
        this.password = pass;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.setName("Gaurav");
        e1.setPass("1234");

        String name = e1.getName();
        String pass = e1.getPass();

        System.out.println( "Name is: " + name + " and Password is: " + pass);
    }
}
