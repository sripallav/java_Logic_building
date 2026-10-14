import java.util.Scanner;

public class AlphabetCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("It lies between a and m");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("It lies between n and z");
        } else {
            System.out.println("Please enter a valid character");
        }

        sc.close();
    }
}