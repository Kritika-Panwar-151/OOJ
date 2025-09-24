package Sample_Programs;
import java.util.Scanner;
public class naturalsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;  
        }
        System.out.println("The sum of first "+n+" natural numbers:"+sum);
    }
}