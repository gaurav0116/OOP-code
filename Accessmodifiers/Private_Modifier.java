package Accessmodifiers;

class Student{
    /* Private Data */
    private String name;

    /* Write Data */
    public void setName(String name){
        this.name = name;
    }

    /* Read Data */
    public String getName(){
        return this.name;
    }
}
public class Private_Modifier {
    public static void main(String[] args) {        
        Student s1 = new Student();
        s1.setName("Gaurav");
        System.out.println(s1.getName());
    }
}
