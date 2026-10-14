import java.util.*;
public class ChChecking {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a ch: ");
        char ch = sc.nextLine().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println(ch + " is uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(ch + " is lowercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch + " is a digit");
        }
        else{
            System.out.println(ch + " is a special character");
        }
        sc.close();
    }

    
}
