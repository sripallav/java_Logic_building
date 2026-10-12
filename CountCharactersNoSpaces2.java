import java.util.Scanner;
public class CountCharactersNoSpaces2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();


        stringcountwosp(str);
        sc.close();



   
    }

    static void stringcountwosp(String str){

        String st1 = str.replace(" ", "");
        
        System.out.print(st1.length());



        

    
    
}
}
