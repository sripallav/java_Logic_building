import java.util.*;
public class ValidTriangleOrNot {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Side1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter a Side2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter a Side3: ");
        int side3 = sc.nextInt();

        boolean valid = side1 +side2 > side3 &&
                        side2 + side3 > side1 &&
                        side1 + side3 > side2 ;

        boolean ispostive = (side1 > 0 && side2 > 0 && side3 > 0);


        if(valid && ispostive){

            System.out.print("it is a valid triangle");

        }
        else{
            System.out.print("it is not a valid triangle");
        }

        sc.close();


    }
    
}
