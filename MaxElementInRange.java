import java.util.Scanner;
public class MaxElementInRange {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

         System.out.print("Array Elements: ");

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter start from: ");
        int start = sc.nextInt();
        System.out.print("enter end from: ");
        int end = sc.nextInt();

       



        maxrange mxr = new maxrange();
        mxr.maxrange(arr, start, end);


    }

    
}

class maxrange{
    public void maxrange(int [] arr,int start, int end){
        int max = arr[start] ;

        for(int i=start;i<end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print(max);



    }
}
