/*Store and display employee details:

Name
ID
Salary
Active status (true/false)*/
import java.util.Scanner;
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String Name = sc.next();
        System.out.print("Enter Employee id: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee salary: ");
        Double Salary = sc.nextDouble();
        System.out.print("Enter Employee Status: ");
        boolean Status = sc.nextBoolean();

        Employeeinfo sd = new Employeeinfo();
        sd.Employeeinfo(id,Name,Salary,Status);



    }

    
}

class Employeeinfo{
    public void Employeeinfo(int id,String Name,Double salary,boolean Status){

        System.out.println("Name: " + Name);
        System.out.println("id: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Active_status: " + Status);


    }
}
