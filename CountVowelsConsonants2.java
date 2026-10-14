import java.util.Scanner;
public class CountVowelsConsonants2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String1: ");
        String name = sc.nextLine();
        System.out.print("enter a String2: ");
        String name1 = sc.nextLine();

        CountVowelsConsonants2(name);
        CountVowelsConsonants2(name1);



        

    }

    static void CountVowelsConsonants2(String name){

        int consonants = 0;
        int vowels = 0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);


            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

                vowels++;
            }

            else if(ch>='A' && ch<='Z' || ch>='a'  && ch<='z'){

                consonants++;
            }
            
        }


            System.out.println("vowels: " + vowels);
            System.out.println("consonants " + consonants);


            

            
        }
    }

    

