import java.util.*;
class Distinct{
    public boolean distinctnum(int num){
            int digit = num%10;
            int digit1 = (num/10)%10;
            int digit2 = num/100;

            return digit!=digit1 && digit!=digit2 && digit1!=digit2;


            
        }

    }

    public class ThreedigitnumberDistinct{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            Distinct dn = new Distinct();

            if(dn.distinctnum(num)){

                System.out.println("All are distinct Digits");
            }

            else{

                System.out.println("All are not distinct Digits");

            }


            
        }




    }

    













class ThreedigitnumberDistinct{

}