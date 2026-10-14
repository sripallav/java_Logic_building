//8. Find total and average of three subject marks.
import java.util.*;
public class TotalAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter Subject1 Marks: ");
        int Subject1 = sc.nextInt();
        System.err.println("enter Subject2 Marks: ");
        int Subject2 = sc.nextInt();
        System.err.println("enter Subject3 Marks: ");
        int Subject3 = sc.nextInt();


        TotalAndAverageMarks tam =new TotalAndAverageMarks();
        tam.TANDV(Subject1, Subject2, Subject3);
        




    }

    
}

class TotalAndAverageMarks{
    public void TANDV(int Subject1,int Subject2,int Subject3){

        int Total = Subject1+Subject2+Subject3;
        double Avg = (Subject1+Subject2+Subject3)/3.0;


        System.out.println("Total: " + Total);
        System.out.println("Average: " + Avg);

    }
}
