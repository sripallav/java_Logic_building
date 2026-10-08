import java.util.Scanner;
public class SwapArrayElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        swap sw = new swap();
        sw.swap(arr);

    }

}

class swap{
    public void swap(int [] arr){

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        // System.out.print(Arrays.toString(arr));

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

        for(int value : arr){
            System.out.print(value + " ");
        }

       
    }
}
