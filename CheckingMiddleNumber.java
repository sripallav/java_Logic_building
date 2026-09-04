import java.util.*;
class middlenumber{
    public void middlenum(int num){

        int digit1 = num%10;
        int digit2 = (num/10)%10;
        int digit3 = num/100;

        if(digit2>digit1 && digit2 > digit3){

            System.out.print("Middle number is Larger");
        }

        else if(digit2<digit1 && digit2<digit3){

            System.out.print("the middle number is smaller");

        }

        else{
            System.out.print("it is neither Smaller or Larger");
        }

        
        
    }
}




public class CheckingMiddleNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a 3 digit num: ");
        int num = sc.nextInt();

        middlenumber mn = new middlenumber();

        mn.middlenum(num);

        sc.close();




        }
        
    }
    

