import java.util.*;
public class AreaAndPerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AandPofT apt = new AandPofT();

        for(int i=1;i<=2;i++){
        System.out.println("enter a side1: ");
        int side1 = sc.nextInt();
        System.out.println("enter a side2: ");
        int side2 = sc.nextInt();
        System.out.println("enter a side3: ");
        int side3 = sc.nextInt();

        System.out.println("Enter height: ");
        double height =sc.nextDouble();
        System.out.println("Enter Base: ");
        double Base =sc.nextDouble();

        apt.AandPofT(side1,side2,side3,height,Base);


    }
}
    
}

class AandPofT{
    public void AandPofT(int side1,int side2,int side3,double height,double Base){
        
        int perimeter = side1+side2+side3;
        double Area = 0.5*Base*height;
        

        System.out.println("Area of Triangle " + Area);
        System.out.println("perimeter of triangle " + perimeter);

    }
}
