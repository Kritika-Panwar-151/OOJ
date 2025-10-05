
import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number of elements:");
        int n=sc.nextInt();
        int a=0,b=1,sum;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;

        }
    }
}

