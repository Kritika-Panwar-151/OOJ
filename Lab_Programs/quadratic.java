
import java.util.Scanner;
public class quadratic
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Quatric equation: ax^2 +bx +c");
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        System.out.print("Enter value of c:");
        int c=sc.nextInt();
        double x1,x2;

        double d=Math.pow(b,2)-(4*a*c);

        if(a==0)
        {
            System.out.println("Not a quadratic equation");
        }
        else
        {
            if(d==0)
            {
                x1=(-b)/(2*a);
                x2=(-b)/(2*a);
                System.out.println("Roots are real and equal");
                System.out.println("Value of x1:"+x1);
                System.out.println("Value of x2:"+x2);
            }
            else if(d>0)
            {
                x1=((-b)+Math.sqrt(d))/(2*a);
                x2=((-b)-Math.sqrt(d))/(2*a);
                System.out.println("Roots are real and distinct");
                System.out.println("Value of x1:"+x1);
                System.out.println("Value of x2:"+x2);
            }
            else
            {
                System.out.println("Roots are complex and imaginary");
            }
        }


    }
}