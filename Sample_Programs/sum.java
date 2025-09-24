package Sample_Programs;
import java.util.Scanner;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+(1/(Math.pow(i,i)));
        }
        System.out.print("Sum of series 1+1/2^2..+1/n^n:"+s);
    }
}