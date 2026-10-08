import java.util.*;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter a Fahareheit: ");
        double Fahareheit = sc.nextDouble();


        

        conversion co = new conversion();
        co.conversions(celsius,Fahareheit);

        System.out.print("Enter a celsius: ");
        double celsius1 = sc.nextDouble();
        System.out.print("Enter a Fahareheit: ");
        double Fahareheit1 = sc.nextDouble();

        co.conversions(celsius1,Fahareheit1);





    }
    
}

class conversion{
    public void conversions(double  celsius,double Fahareheit){

        double celsius_result = (Fahareheit-32)*5.0/9;
        double Fahareheit_result = (celsius*9.0/5)+32;


      System.out.println("Fahrenheit: " + Fahareheit_result);
      System.out.println("Celsius: " + celsius_result);


    }
}


