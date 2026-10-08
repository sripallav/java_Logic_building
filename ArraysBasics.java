import java.util.Arrays;
import java.util.Scanner;
class ArraysBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an array: ");
        int size = sc.nextInt();

        // Array of primitives..............................................
        // int arr [] = new int[size];

        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }

        // First way of accessing and printing array elements...

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }

        // Second way using for each loop for accessing and printing array elements...

        // for(int num : arr){
        //     System.out.print(num + " ");
        // }

        //Third way

      
        // System.out.print(Arrays.toString(arr));

        // //Modify

        // arr[3] = 25;

        // System.out.print(Arrays.toString(arr));


        //Array of objects......................

        String [] str = new String[size];

        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
            
        }

        //1st way

        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i] + " ");
        // }

        //  2nd way

        // for(String str1:str){
        //     System.out.print(str1 + " ");
        // }

        // 3rd way

        System.out.print(Arrays.toString(str));

        //Modify

        str[3] = "pallav";

        System.out.print(Arrays.toString(str));





        


        
    }
}