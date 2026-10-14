import java.util.Scanner;
public class CompareStringsLexicographically2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String1: ");
        String str1 = sc.nextLine();
        System.out.print("enter a String2: ");
        String str2 = sc.nextLine();

        comparing(str1,str2);
        sc.close();

        


    }

    static void comparing(String str1,String str2){
        System.out.print(str1.compareTo(str2));
        
    }
}





