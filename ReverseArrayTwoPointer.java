import java.util.*;
public class ReverseArrayTwoPointer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        twopointers tp = new twopointers();
        tp.twopointers(arr);
    }
    
}

class twopointers{
    public void twopointers(int arr[]){

        System.out.println("array elements before Swapping: ");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }

        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;


        System.out.println("array of elements after swapping: ");

         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }


    }
}
