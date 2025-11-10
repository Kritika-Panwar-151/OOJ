import CIE.*;
import SEE.*;
import java.util.Scanner;
class finalmarks
{
    int finalMarks[]=new int[5];
    void calculate(external e,internals i)
    {
        for(int j=0;j<5;j++)
        {
            finalMarks[j]=e.seeMarks[j]+i.internalMarks[j];
        }
    }
    void display()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println("Final marks of course "+(j+1)+":"+finalMarks[j]);
        }
    }

}
public class marks
{   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Usn:");
        String u=sc.next();
        System.out.println("Enter Name:");
        String n=sc.next();
        System.out.println("Enter Semester:");
        int s=sc.nextInt();
        external s1=new external(u,n,s);
        internals i1=new internals();
        finalmarks f1=new finalmarks();
        f1.calculate(s1,i1);
        s1.display();
        f1.display();
    }
    


}