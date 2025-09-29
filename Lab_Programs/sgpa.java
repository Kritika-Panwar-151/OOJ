import java.util.Scanner;
class student
{
    String usn;
    String name;
    int[] credits=new int[5];
    int[] marks=new int[5];

    void  accept()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the USN:");
        usn=sc.next();
        System.out.println("Enter the Name:");
        name=sc.next();
        
        System.out.println("Enter the Marks and Credits of 5 subjects:");
        for(int i=0;i<5;i++)
        {
            System.out.println("Subject"+(i+1)+"marks:");
            marks[i]=sc.nextInt();
            System.out.println("Subject"+(i+1)+"credits:");
            credits[i]=sc.nextInt();
            
            
        }
        
    }

    int grade(int m)
    {
        if(m>=90)
        {
            return 10;
        }
        else if(m>=80)
        {
            return 9;
        }
        else if(m>=70)
        {
            return 8;
        }
        else if(m>=60)
        {
            return 7;
        }
        else if(m>=50)
        {
            return 6;
        }
        else if(m>=40)
        {
            return 5;
        }
        else if(m>=30)
        {
            return 4;
        }
        else if(m>=20)
        {
            return 3;
        }
        else if(m>=10)
        {
            return 2;
        }
        else
        {
            return 1;
        } 

    }
    double calculate_sgpa()
    {
        double total_gradepoints=0;
        double c=0;
        double sgpa;
        for(int j=0;j<5;j++)
        {
            
            total_gradepoints+=grade(marks[j])*credits[j];
            c+=credits[j];
        }
       
        sgpa=total_gradepoints/c;
        return sgpa;
    }
    
    void display(double sgpa)
    {
        System.out.println("USN:"+usn);
        System.out.println("Name:"+name); 
        System.out.println("SGPA:"+sgpa);
    }

}

public class sgpa
{
    public static void main(String args[])
    {
        student s=new student();
        s.accept();
        double sgpa=s.calculate_sgpa();
        s.display(sgpa);
           
    }
}