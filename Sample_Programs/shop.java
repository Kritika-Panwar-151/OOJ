import java.util.Scanner;
public class shop
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            int p[]=new int[5];
            System.out.println("Enter product prices:");
            for(int i=0;i<5;i++)
            {
                System.out.print((i+1)+":");
                int n=sc.nextInt();
                p[i]=n;
            }
            System.out.println("\nEnter the index:");
            int n=sc.nextInt();
            System.out.println("Price:"+p[n]);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception:Index not in bounds");
        }
    }
}