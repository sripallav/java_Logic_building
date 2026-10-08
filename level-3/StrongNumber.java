import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        strong st = new strong();
        System.out.println(st.strong(num));
    }
    

}

class strong{
    public String strong(int num){

        int original = num;
        int sum = 0;


        while(num>0){
            int fact = 1;
            int digit = num%10;
            for(int i=1;i<=digit;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            num = num/10;

        }

        if(original==sum){
            return "Strong number";
        }

        else{
            return "not a Strong number";
        }






        
    }
}
