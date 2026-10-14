import java.util.Scanner;
public class CountDigitsLettersSpecial2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String: ");
        String name = sc.nextLine();


        digitslettersspecials ds = new digitslettersspecials();
        ds.digitslettersspecial(name);
        

    }
    
}

class digitslettersspecials{
    public void digitslettersspecial(String name){

        int Letters = 0;
        int digits = 0;
        int specials = 0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);

            if(Character.isLetter(ch)){

                Letters++;
            }
            
            else if(Character.isDigit(ch)) {
                digits++;
            }

            else{
                specials++;
            }
        }

        System.out.println("Letters: " + Letters);
        System.out.println("digits: " + digits);
        System.out.println("specials: " + specials);
        

    }
}
