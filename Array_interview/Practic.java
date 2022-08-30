package Array_interview;

public class Practic {

    /* Find duplicate no in array */
    static void Duplicate(){
        int Array[] = {1,2,3,1,5,2,1};
        for(int i=0; i<Array.length; i++){
            for(int j=i+1; j<Array.length; j++){
                if(Array[i]==Array[j]){
                    System.out.println("Duplicate no is: "+ Array[j]);
                }
            }
        }
    }

    /* Find Max & Min no in array */
    static void MinMax(){
        int Arr[] = {1,5,100, 45, 90, 73};
        int maxnum = Arr[0];
        int minmum = Arr[0];

        for(int i=0; i<Arr.length; i++){
            if(Arr[i]>maxnum){
                maxnum = Arr[i];
            }
            else if(minmum> Arr[i]){
                minmum = Arr[i];
            }
        }

        System.out.println("Max no: "+maxnum+ " min no: "+minmum);
    }

    public static void main(String[] args) {
        MinMax();
    }
}
