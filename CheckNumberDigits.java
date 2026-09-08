// Check whether a given integer is single-digit, double-digit, or multi-digit. 
import java.util.Scanner;
class digitscheck{
    public void digitschecking(int num){
        int count = 0;
        while(num>0){
            count+=1;
            num = num/10;

    }

    if(count==1){

        System.out.println("given integer is single-digit");
    }
    else if(count==2){
        System.out.println("given integer is double-digit");
        
    }
    else{
        System.out.println("given integer is multi-digit");

    }
}
}



public class CheckNumberDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int num = sc.nextInt();

        digitscheck dc = new digitscheck();
        dc.digitschecking(num);

        
    }

    
}
