
import java.util.Scanner;

public class greatest_three
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int n1=sc.nextInt();
        System.out.print("Enter the number 2:");
        int n2=sc.nextInt();
        System.out.print("Enter the number 3:");
        int n3=sc.nextInt();

        if(n1>=n2 && n1>=n3)
        {
            System.out.print(n1+" is greatest");
        }
        else if(n2>=n1 && n2>=n3)
        {
            System.out.print(n2+" is greatest");
        }
        else
        {
            System.out.print(n3+" is greatest");
        }
        
    }
}