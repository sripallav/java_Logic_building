import java.util.Scanner;
public class MaxElementArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        

        System.out.print("enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Maxelement mx = new Maxelement();
        mx.Maxelement(arr);

    
        
        
    }
    
}

class Maxelement{
    public void Maxelement(int [] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.print("max element of array is: " + max);

    }
}
