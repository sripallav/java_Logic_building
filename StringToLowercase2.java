import java.util.Scanner;
public class StringToLowercase2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String: ");
        String str = sc.nextLine();
        System.out.print("enter a String1: ");
        String str1 = sc.nextLine();

        strlower(str);
        System.out.print("\n");

         strlower(str1);

        sc.close();

    }

    static void strlower(String str){

        System.out.print(str.toLowerCase());
    }
    
}
