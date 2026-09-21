import java.util.*;
public class FindLargerNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first Num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Num: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println( num1 + " is Larger");
        }
        else if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " Both are Equal");
        }
        else{
            System.out.println(num2 + " is Larger");
        }

        sc.close();

    }
    
}
