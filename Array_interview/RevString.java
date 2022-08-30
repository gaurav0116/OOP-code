package Array_interview;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        String orignal;
        String reverse="";

        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        
        // input string
        orignal = sc.nextLine();


        // revese logic
        for(int i=orignal.length()-1; i >=0; i-- ){
            reverse = reverse + orignal.charAt(i);
        }

        System.out.println("Original: "+orignal);
        System.out.println("Reverse : "+ reverse);
    }
}
