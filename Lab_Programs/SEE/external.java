package SEE;
import CIE.personal;
import java.util.Scanner;

public class external extends personal
{
    public int seeMarks[]=new int[5];
    public external(String u,String n,int s)
    {
        super(u,n,s);
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<6;i++)
        {
            
            System.out.println("Enter course "+i+"'s SEE marks:");
            int m=sc.nextInt();
            seeMarks[i-1]=m;
        }
    }
    public void display()
    {
        System.out.println("\nUSN:"+usn);
        System.out.println("Name:"+name);
        System.out.println("Semester:"+sem);

    }
}
 