package Array_interview;

public class RevArr {

    static void method1(){
        int arr[] = new int[]{1,2,3,4};

        System.out.println("Print orignal array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Reverse Array: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
