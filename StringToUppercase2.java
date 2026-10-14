import java.util.Scanner;
public class StringToUppercase2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String: ");
        String str = sc.nextLine();

        strupper(str);
        sc.close();


    }

    static void strupper(String str){
        System.out.print(str.toUpperCase());

    }



}
    

