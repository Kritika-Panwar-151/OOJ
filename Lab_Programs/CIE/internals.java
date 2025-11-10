package CIE;
import java.util.Scanner;
public class internals
{
    public int internalMarks[]=new int[5];
    public internals()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<6;i++)
        {
            
            System.out.println("Enter course "+i+"'s Internal marks:");
            int m=sc.nextInt();
            internalMarks[i-1]=m;
        }
    }
}