import java.util.*;
public class CheckNumDivBy3And5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("The Number is Divisible By Both 3 And 5");
        }
        else{
            System.out.println("The num is not Divisible By both 3 and 5");
        }
        sc.close();
    }


}