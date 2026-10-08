import java.util.Scanner;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.print("enter array elemnts: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        reversearr ra = new reversearr();
        ra.reversearr(arr);
    }
    
}

class reversearr{
    public void reversearr(int [] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }

}
