import java.util.Scanner;

class employee
{
    String empId;
    String name;
    int hoursWorked;
    int hourlyRate;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the Employee ID:");
        empId=sc.next();
        System.out.println("Enter the Employee Name:");
        name=sc.next();
        System.out.println("Enter the Hours Worked:");
        hoursWorked=sc.nextInt();
        System.out.println("Enter the Hourly Rate:");
        hourlyRate=sc.nextInt();
    }
    double salary()
    {
        double sal=hoursWorked*hourlyRate;
        return sal;
    }
    void display(double sal)
    {
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+name);
        System.out.println("Total Salary:"+sal);
    }
}
public class empdetails 
{   
    public static void main(String args[])
    {
        employee emp1=new employee();
        emp1.accept();
        double tsal=emp1.salary();
        emp1.display(tsal);
    }
}

