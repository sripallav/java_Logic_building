import java.util.Scanner;
public class AreaOfSquare {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a side: ");
    int side = sc.nextInt();

    area a = new area();
    a.areaofsquare(side);
    
    }
    
}

class area{
    public void areaofsquare(int side){
        int Area = side*side;
        System.out.print("Area of square: " + Area);



    }
}


