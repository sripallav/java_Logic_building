
// Check if a number is positive/negative and if positive,
// determine whether it is odd or even.

import java.util.*;

public class PositiveNegativeOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        checking ch = new checking();

        System.out.println(ch.Po_or_Ne_EorO(num));

        sc.close();
    }
}

class checking {

    public String Po_or_Ne_EorO(int num) {

        if (num > 0) {

            if (num % 2 == 0) {
                return "Positive Even";
            }
            else {
                return "Positive Odd";
            }
        }
        else if (num < 0) {

            return "Negative";
        }
        else {

            return "Zero";
        }
    }
}

