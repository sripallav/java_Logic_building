import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        circlearea ca = new circlearea();

        for(int i=1;i<=3;i++){

        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        ca.areacircle(radius);

    }

    
}
}

class circlearea{
    public void areacircle(double radius){
        double Area = Math.PI*radius*radius;

        System.out.println("Area of circle: " + Area);

    }
}

