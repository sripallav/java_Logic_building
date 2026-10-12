
import java.util.Scanner;
public class CheckEmptyString2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String1: ");
        String str = sc.nextLine();

        boolean s = empty(str);
        System.out.print(s);
        sc.close();
        
    }

    static boolean empty(String str){
        return str.isEmpty();
    }
}

