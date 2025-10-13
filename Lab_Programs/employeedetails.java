import java.util.Scanner;
class Employee
{
    String name;
    int salary;
    Employee(String n,int s)
    {
        name=n;
        salary=s;
    }
    void compareSalary(Employee e)
    {
        Scanner sc=new Scanner(System.in);
        if(this.salary>=e.salary)
        {
            System.out.println(this.name+" has higer salary than "+e.name);
        }
        else
        {
            System.out.println(e.name+" has higer salary than "+this.name);
        }
    }
}
 
public class employeedetails
{
    public static void main(String[] args) 
    {
        Employee e1=new Employee("Tom",56000);
        Employee e2=new Employee("Tina",76000);
        e1.compareSalary(e2);
    }
}