import java.util.*;
class leap{
    public boolean leapyear(int num){
        if(num%4==0 && num%100!=0 || num%400==0){
            return true;

        }
        else{
            return false;
        }
    }
}

public class CheckLeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();

        leap year = new leap();
        System.out.print(year.leapyear(num));
        
        
    }

}