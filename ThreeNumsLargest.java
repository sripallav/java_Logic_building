import java.util.*;
public class ThreeNumsLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter a num2: ");
        int num2 = sc.nextInt();
        System.out.print("enter a num3: ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the largest number");
        }
        else if(num2 >= num3){
            System.out.println(num2 + " is the largest number");
        }
        else{
            System.out.println(num3 + " is largest number");
        }
        sc.close();
    }
    
}
