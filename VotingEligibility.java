import java.util.Scanner;
public class VotingEligibility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligible for Vote");
        }
        else if(age >= 0){
            System.out.println("Not Eligible for Vote");

        }else{
            
            System.out.println("Enter Valid age");

        }

        sc.close();
        
    }



    
}
