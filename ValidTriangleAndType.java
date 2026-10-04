import java.util.Scanner;
class ValidTriangleAndType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter a side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter a side 3: ");
        int side3 = sc.nextInt();

        boolean isvalid = (side1>0 && side2>0 && side3 > 0) &&
                          (side1+side2 > side3) &&
                          (side1+side3 > side2) &&
                          (side2+side3 > side1 );


        if(!isvalid)  {
             System.out.println("It is not a valid triangle");
        }
        else if(side1 == side2 && side2 == side3){

            System.out.println("It is an equilateral triangle");
        }        
        else if(side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("It is an isosceles triangle");
        }
        
        else {
             System.out.println("It is a scalene triangle");

        }
        sc.close();


        }
        


        
    }
