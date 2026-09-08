import java.util.*;
public class SwapTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        swapnumbers sn = new swapnumbers();
        sn.swapednumber(num1, num2);


    }
}

class swapnumbers{
    public void swapednumber(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;


        System.out.println("After Swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        



    }
    

}
