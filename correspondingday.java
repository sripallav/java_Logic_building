import java.util.Scanner;

public class correspondingday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a day number (1-7): ");
        int dayNum = sc.nextInt();

        String dayName = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input. Please enter a number between 1 and 7.";
        };

        System.out.println(dayName);
        sc.close();
    }
}