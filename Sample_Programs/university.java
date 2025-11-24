import java.util.Scanner;
public class university
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int n=sc.nextInt();
            String s[]=new String[n];
            System.out.println("Enter students names:");
            for(int i=0;i<n;i++)
            {
                System.out.print((i+1)+":");
                String name=sc.next();
                if(name.equalsIgnoreCase("null")) s[i]=null;//null-smallcase
                else s[i]=name;
                
                
            }
            System.out.println("\nNames:");
            for(int i=0;i<n;i++)
            {
                System.out.println((i+1)+":"+s[i].length());
            }
        }
        catch(NullPointerException e)//Must give object e
        {
            System.out.println("Exception:Name cannot be NULL");
        }                                                                                                                 
        finally
        {
            System.out.println("Program is Done");
        }

    }
}