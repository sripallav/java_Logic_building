import java.util.Scanner;
public class WishingBasedOnHours {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour. Please enter a value between 0 and 23.");
        } else if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

        sc.close();
    }
}
    

