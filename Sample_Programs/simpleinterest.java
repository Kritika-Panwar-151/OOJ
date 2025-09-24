package Sample_Programs;
import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        float p=sc.nextFloat();
        System.out.println("Enter the rate of intrest:");
        float r=sc.nextFloat();
        System.out.println("Enter the time in years:");
        float t=sc.nextFloat();
        float si=(p*r*t)/100;
        float amt=si+p;

        System.out.println("The simple interest is:"+si);
        System.out.println("The total amount is:"+amt);
    }
}