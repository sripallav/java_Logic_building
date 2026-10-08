import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter height: ");
        float height = sc.nextFloat();
        System.out.print("enter breadth: ");
        float breadth = sc.nextFloat();

        Areacal aoft = new Areacal();
        System.out.print(aoft.TriangleArea(height,breadth));



        
    }
}

class Areacal{
    public float TriangleArea(float height,float breadth){
        float area = 0.5f * height * breadth;
        return area;
    }
}
