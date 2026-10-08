import java.util.Scanner;
public class FirstLastCharacter2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String1: ");
        String str = sc.nextLine();
        System.out.print("enter a String2: ");

        String str2 = sc.nextLine();

        firstcharacter(str);
        System.out.print("\n");
        firstcharacter(str2);

        sc.close();


    }


        static void firstcharacter(String str){

            
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length() - 1));
        
    
}
}

                
   
    

