
// Classify student result based on marks:
// Distinction, First Class, Second Class, Pass, or Fail.

import java.util.Scanner;

public class studentresult {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        result rs = new result();

        System.out.println(rs.stresult(marks));

        sc.close();
    }
}

class result {

    public String stresult(int marks) {

        if (marks >= 95) {
            return "Distinction";
        }
        else if (marks >= 85) {
            return "First Class";
        }
        else if (marks >= 60) {
            return "Second Class";
        }
        else if (marks >= 50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    
}
}
```
