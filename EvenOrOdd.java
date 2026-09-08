import java.util.*;
public class EvenOrOdd {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter a num:");
            int num = sc.nextInt();

            if(num%2==0){
                System.out.println("The Number is even");
            }
            else{
                System.out.println("The Number is Odd");
            }
            sc.close();
        }
    }

    

