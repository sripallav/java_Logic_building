import java.util.*;
class checkingnumber{
    public String checknumber(int num){
        if(num>0){
            return "positive";
        }
        else if(num<0){
            return "negative";
        }
        else{
            return "zero";
        }

        
        
    }
}

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();

        checkingnumber checking = new checkingnumber();
        System.out.print(checking.checknumber(num));

        sc.close();
        

    }

    
    
}
        
