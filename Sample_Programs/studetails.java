import java.util.Scanner;
 class student
 {
    String usn;
    String name;
    double marks;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the usn:");
        usn=sc.next();
        System.out.println("Enter the name:");
        name=sc.next();
        System.out.println("Enter the marks:");
        marks=sc.nextDouble();
    }

    void display()
    {
        System.out.println("Usn:"+usn);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+marks);
    }
 }

 public class studetails
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the number of students:");
        int n=sc.nextInt();
        student[] students=new student[n];
        for(int i=0;i<n;i++)
        {
            students[i]=new student();
            System.out.println("\nEnter details of student"+(i+1)+":");
            students[i].accept();
        }
        System.out.println("Details of:");
        for(int i=0;i<n;i++)
        {
            System.out.println("\nStudent"+(i+1)+":");
            students[i].display();
        }
    }
 }